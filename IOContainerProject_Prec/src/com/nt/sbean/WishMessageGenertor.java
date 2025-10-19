package com.nt.sbean;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component("wmg")

public class WishMessageGenertor
{
private LocalDateTime datetime;

public WishMessageGenertor()
{
	System.out.println("WishMessageGenertor : 0 - param Contructore");
}
}
