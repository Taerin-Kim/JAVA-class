package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI(
				"http://localhost:8787/Java19_URI_Web/res.jsp?name=%EA%B9%80%ED%83%9C%EB%A6%B0&addr=%EB%87%BD%EB%87%BD");
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());

	}

}
