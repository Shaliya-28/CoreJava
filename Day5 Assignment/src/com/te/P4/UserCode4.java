package com.te.P4;

public class UserCode4 {
	public static String display(String str)
	{
		char[] ch=str.toCharArray();
		String s="";
		for (int i = 0; i < ch.length; i++)
		{
			if(i%2==0)
			{
				s=s+ch[i];
			}
			else if(i%2!=0)
			{
				if(ch[i]!='A' && ch[i]!='a' && ch[i]!='E' && ch[i]!='e' && ch[i]!='I' && ch[i]!='i' && ch[i]!='O' && ch[i]!='o' && ch[i]!='U'&& ch[i]!='u')
					{
					s=s+ch[i];
					}
				}
		}
		return s;
	}
}


