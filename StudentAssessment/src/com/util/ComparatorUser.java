package com.util;

import java.util.Comparator;

import com.model.TUser;

public class ComparatorUser implements Comparator
{

	public int compare(Object o1, Object o2) 
	{
	         //����return ((TUser) o1).getZongfen() - ((TUser) o2).getZongfen();
		
		
		     //����
		     return ((TUser) o2).getZongfen() - ((TUser) o1).getZongfen();
	}


}
