class Tv
{
int tv_cost;
String tv_brand;
String tv_type;

Tv(int tc, String tb, String tt){
	tv_cost = tc;
tv_brand=tb;
tv_type=tt;
}

public static void main(String[] args){
	Tv t = new Tv(10000, "LG", "Smart");
System.out.println("Tv : "+ t.tv_brand+"\n Tv cost : "+t.tv_cost+"\nType : "+t.tv_type);
}
}