package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component("menu")
public class HotelMenu
{
	@Value("${menu.dosa}")
private Float dosaPrice;
	
	@Value("${menu.idly}")
private Float idlyPrice;
	
	@Value("${menu.poha}")
private Float pohaPrice;
	
	@Value("${menu.vadapav}")
private Float vadapavPrice;

	@Override
	public String toString() {
		return "HotelMenu [dosaPrice=" + dosaPrice + ", idlyPrice=" + idlyPrice + ", pohaPrice=" + pohaPrice
				+ ", vadapavPrice=" + vadapavPrice + "]";
	}
	
	
}
