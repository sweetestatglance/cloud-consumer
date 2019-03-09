package wsdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WsdemoApplicationTests.class)
public class WsdemoApplicationTests {

	@Test
	public void fun1() {

		System.out.println("start");
		Date d1 = new Date();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("模拟业务处理完成");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("end");
		Date d2 = new Date();
		System.out.println((d2.getTime())-(d1.getTime()));
	}

	@Test
	public void fun2() throws InterruptedException {

		System.out.println("start");
		Date d1 = new Date();
		Thread.sleep(5000);
		System.out.println("模拟业务处理完成");
		System.out.println("end");
		Date d2 = new Date();
		System.out.println((d2.getTime())-(d1.getTime()));
	}

}
