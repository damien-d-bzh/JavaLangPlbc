public class CerclePlusGrand {
	static int i, max, r_max;
	
	public static int plusGrandDesCercles(Cercles b[], int nmbreCercles)
	{
		max=b[0].r;
		i=1;
		while(i<nmbreCercles)
		{
			if(max<b[i].r)
			{
				max=b[i].r;
				r_max=i;
			}
			i++;
		}
		return r_max+1;
	}
}
