package com.nt.test;

import com.nt.sbeans.WishGenerator;

public interface XmlBeanFactory {

	WishGenerator getBean(String string, Class<WishGenerator> class1);

}
