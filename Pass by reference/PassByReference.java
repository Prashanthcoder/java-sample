//meghanaBIRIYANI
class MB
{
	void food(){
		System.out.println("Biryani");
}
}
class Delivery
{
	static void getfood(MB m3)
	{
		m3.food();
	}
}
class Swiggy
{
	static void order(MB m2){
		Delivery.getfood(m2);
			}
}

// farmer
class Farmer
{
	void crop(){
		System.out.println("Rice");
}
}
class APMC
{
	static void getCrop(Farmer c3)
	{
		c3.crop();
	}
}
class shop
{
	static void item(Farmer c2){
		APMC.getCrop(c2);
			}
}
//Car Factory
class CarFa
{
	void models(){
		System.out.println("BMW M5");
}
}
class distribute
{
	static void getModel(CarFa M3)
	{
		M3.models();
	}
}
class Showroom
{
	static void models(CarFa M2){
		distribute.getModel(M2);
			}
}
// ww3
class iran
{
	void missile(){
		System.out.println("missaile launch successful...!");
}
}
class israel
{
	static void rocket(iran r3)
	{
		r3.missile();
	}
}
class soldiers
{
	static void weapon(iran r2){
		israel.rocket(r2);
			}
}

//pizzahut
class Ph
{
	void pizza(){
		System.out.println("Golden corn");
}
}
class DeliveryBoy
{
	static void type(Ph p3)
	{
		p3.pizza();
	}
}
class zomato
{
	static void order(Ph p2){
		DeliveryBoy.type(p2);
			}
}

//bank
class customer
{
	void details(){
		System.out.println("account details");
}
}
class bank
{
	static void data(customer C3)
	{
		C3.details();
	}
}
class Tmodules
{
	static void module(customer C2){
		bank.data(C2);
			}
}

//hospital
class patient
{
	void data(){
		System.out.println("patient details");
}
}
class reception
{
	static void detail(patient P3)
	{
		P3.data();
	}
}
class doctor
{
	static void pdd(patient P2){
		reception.detail(P2);
			}
}


class PassByReference 
{
	public static void main(String[] args) 
	{
		MB m1=new MB();
		Swiggy.order(m1);
		Farmer c1=new Farmer();
		shop.item(c1);
		CarFa M1=new CarFa();
		Showroom.models(M1);
		iran r1=new iran();
		soldiers.weapon(r1);
		Ph p1=new Ph();
		zomato.order(p1);
		customer C1=new customer();
		Tmodules.module(C1);
		patient P1=new patient();
		doctor.pdd(P1);
		
	}
}