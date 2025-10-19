package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class HotelInfo
{
	@Value("${hotel.name}")
	private String name;
	@Value("${hotel.id}")
	private Integer id;
	@Value("${hotel.location}")
    private String location;
	
	@Value("${customer.name}")
    private String customerName;
	@Value("#{menu.dosaPrice +menu.idlyPrice +menu.vadapavPrice+menu.pohaPrice")//SPEL
    private Float billAmount;
	
	@Value("${customer.discount}")
    private Float discount;
	//@Value("#{hotel.BillAmount-(hotel.billAmount*customer.discount/100.00)}")
    private Float finalBillAmount;

	
	
//gets System properties values
	@Value("${os.name}")
	private String osName;
// gets env..System properties values
	@Value("${Path}")
	private String pathData;
	
	
	public Float calCulateDiscount(float minAmount)
	{
		if (billAmount>=200.0)
		{
			finalBillAmount=billAmount-(billAmount * discount/100.0f);
		}
		else
		{
			finalBillAmount=billAmount;
		}
		return finalBillAmount;
		}

	
	//ToString 
	@Override
	public String toString() {
		return "HotelInfo [name=" + name + ", id=" + id + ", location=" + location + ", customerName=" + customerName
				+ ", billAmount=" + billAmount + "finalBillAmount="+finalBillAmount+", osName=" + osName + ", pathData=" + pathData + "]";
		
	}

}
