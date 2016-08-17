package configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
@EnableAsync
@EnableScheduling
public class ThreadPoolConfigure implements SchedulingConfigurer{

	public static final int THREAD_POOL_QUEUE_NUM = 25;

	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(getaskScheduler());
	}
	
	//线程池
	@Bean(name = "CustomThreadPool",destroyMethod="shutdown")
	public TaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		int cpuNum = Runtime.getRuntime().availableProcessors();
		taskExecutor.setCorePoolSize(cpuNum);
		taskExecutor.setMaxPoolSize(2 * cpuNum);
		taskExecutor.setQueueCapacity(THREAD_POOL_QUEUE_NUM);
		return taskExecutor;
	}
	
	//调度器
	@Bean(destroyMethod="shutdown")
	public TaskScheduler getaskScheduler(){
		ThreadPoolTaskScheduler taskScheduler=new ThreadPoolTaskScheduler();
		int cpuNum = Runtime.getRuntime().availableProcessors();
		taskScheduler.setPoolSize(2*cpuNum);
		return taskScheduler;
	}
}
