package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);

		// Hello 객체 생성 및 데이터 설정
		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();
		System.out.println(data);
	}
}