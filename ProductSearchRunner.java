class ProductSearchRunner{
	public static void main(String... args){
		double cost=ProductSearch.getPriceByProduct("Earbuds");
		System.out.println(cost);
		double cost1=ProductSearch.getPriceByProduct("Speakers");
		System.out.println(cost1);
		double cost2=ProductSearch.getPriceByProduct("Watch");
		System.out.println(cost2);
		double cost3=ProductSearch.getPriceByProduct("PowerBank");
		System.out.println(cost3);
		double cost4=ProductSearch.getPriceByProduct("Kettle");
		System.out.println(cost4);
		double cost5=ProductSearch.getPriceByProduct("Blender");
		System.out.println(cost5);
		double cost6=ProductSearch.getPriceByProduct("Gaming Headset");
		System.out.println(cost6);
		double cost7=ProductSearch.getPriceByProduct("Sunglasses");
		System.out.println(cost7);
		double cost8=ProductSearch.getPriceByProduct("Perfume");
		System.out.println(cost8);
		double cost9=ProductSearch.getPriceByProduct("Sneakers");
		System.out.println(cost9);
		double cost10=ProductSearch.getPriceByProduct("Sandals");
		System.out.println(cost10);
		double cost11=ProductSearch.getPriceByProduct("Jacket");
		System.out.println(cost11);
		double cost12=ProductSearch.getPriceByProduct("Hat");
		System.out.println(cost12);
		double cost13=ProductSearch.getPriceByProduct("Jeanspant");
		System.out.println(cost13);
		double cost14=ProductSearch.getPriceByProduct("Braclet");
		System.out.println(cost14);
		double cost15=ProductSearch.getPriceByProduct("Handbag");
		System.out.println(cost15);
		double cost16=ProductSearch.getPriceByProduct("Slingbag");
		System.out.println(cost16);
		double cost17=ProductSearch.getPriceByProduct("Compact");
		System.out.println(cost17);
		double cost18=ProductSearch.getPriceByProduct("Foundation");
		System.out.println(cost18);
		double cost19=ProductSearch.getPriceByProduct("Lipstick");
		System.out.println(cost19);
		double cost20=ProductSearch.getPriceByProduct("Coat");
		System.out.println(cost20);
		double cost21=ProductSearch.getPriceByProduct("Bed");
		System.out.println(cost21);
		double cost22=ProductSearch.getPriceByProduct("Crossbag");
		System.out.println(cost22);
		double cost23=ProductSearch.getPriceByProduct("Charger");
		System.out.println(cost23);
		double cost24=ProductSearch.getPriceByProduct("HandFan");
		System.out.println(cost24);
		
		String product="Earbuds";
		ProductSearch.searchProductAvailability(product);
		String product1="Speakers";
		ProductSearch.searchProductAvailability(product1);
		String product2="Watch";
		ProductSearch.searchProductAvailability(product2);
		String product3="PowerBank";
		ProductSearch.searchProductAvailability(product3);
		String product4="Kettle";
		ProductSearch.searchProductAvailability(product4);
		String product5="Blender";
		ProductSearch.searchProductAvailability(product5);
		String product6="Gaming Headset";
		ProductSearch.searchProductAvailability(product6);
		String product7="Sunglasses";
		ProductSearch.searchProductAvailability(product7);
		String product8="Perfume";
		ProductSearch.searchProductAvailability(product8);
		String product9="Sneakers";
		ProductSearch.searchProductAvailability(product9);
		String product10="Sandals";
		ProductSearch.searchProductAvailability(product10);
		String product11="Jacket";
		ProductSearch.searchProductAvailability(product11);
		String product12="Hat";
		ProductSearch.searchProductAvailability(product12);
		String product13="Jeanspant";
		ProductSearch.searchProductAvailability(product13);
		String product14="Braclet";
		ProductSearch.searchProductAvailability(product14);
		String product15="Handbag";
		ProductSearch.searchProductAvailability(product15);
		String product16="Slingbag";
		ProductSearch.searchProductAvailability(product16);
		String product17="Compact";
		ProductSearch.searchProductAvailability(product17);
		String product18="Foundation";
		ProductSearch.searchProductAvailability(product18);
		String product19="Lipstick";
		ProductSearch.searchProductAvailability(product19);
		String product20="Mousepad";
		ProductSearch.searchProductAvailability(product20);
		String product21="Coat";
		ProductSearch.searchProductAvailability(product21);
		String product22="Bed";
		ProductSearch.searchProductAvailability(product22);
		String product23="Keyboard";
		ProductSearch.searchProductAvailability(product23);
		
		
		String[] ref=ProductSearch.getBrandsByProduct("Earbuds");
		for(String reff:ref){
		System.out.println(reff);
		}
		String[] ref1=ProductSearch.getBrandsByProduct("Ring");
		for(String reff1:ref1){
		System.out.println(reff1);
		}
		String[] ref2=ProductSearch.getBrandsByProduct("SmartPhone");
		for(String reff2:ref2){
		System.out.println(reff2);
		}
		String[] ref3=ProductSearch.getBrandsByProduct("Sneakers");
		for(String reff3:ref3){
		System.out.println(reff3);
		}
		String[] ref4=ProductSearch.getBrandsByProduct("Perfume");
		for(String reff4:ref4){
		System.out.println(reff4);
		}
		String[] ref5=ProductSearch.getBrandsByProduct("Sunglasses");
		for(String reff5:ref5){
		System.out.println(reff5);
		}
		String[] ref6=ProductSearch.getBrandsByProduct("Gaming Headset");
		for(String reff6:ref6){
		System.out.println(reff6);
		}
		String[] ref7=ProductSearch.getBrandsByProduct("Blender");
		for(String reff7:ref7){
		System.out.println(reff7);
		}
		String[] ref8=ProductSearch.getBrandsByProduct("Kettle");
		for(String reff8:ref8){
		System.out.println(reff8);
		}
		String[] ref9=ProductSearch.getBrandsByProduct("PowerBank");
		for(String reff9:ref9){
		System.out.println(reff9);
		}
		String[] ref10=ProductSearch.getBrandsByProduct("Watch");
		for(String reff10:ref10){
		System.out.println(reff10);
		}
		String[] ref11=ProductSearch.getBrandsByProduct("Speakers");
		for(String reff11:ref11){
		System.out.println(reff11);
		}
		String[] ref12=ProductSearch.getBrandsByProduct("Milk");
		for(String reff12:ref12){
		System.out.println(reff12);
		}
		String[] ref13=ProductSearch.getBrandsByProduct("Umbrella");
		for(String reff13:ref13){
		System.out.println(reff13);
		}
		String[] ref14=ProductSearch.getBrandsByProduct("Sarees");
		for(String reff14:ref14){
		System.out.println(reff14);
		}
		String[] ref15=ProductSearch.getBrandsByProduct("Perfumes");
		for(String reff15:ref15){
		System.out.println(reff15);
		}
		String[] ref16=ProductSearch.getBrandsByProduct("FlipFlops");
		for(String reff16:ref16){
		System.out.println(reff16);
		}
		String[] ref17=ProductSearch.getBrandsByProduct("Tshirt");
		for(String reff17:ref17){
		System.out.println(reff17);
		}
		String[] ref18=ProductSearch.getBrandsByProduct("Laptop");
		for(String reff18:ref18){
		System.out.println(reff18);
		}
		String[] ref19=ProductSearch.getBrandsByProduct("SmartPhone");
		for(String reff19:ref19){
		System.out.println(reff19);
		}
		String[] ref20=ProductSearch.getBrandsByProduct("Cement");
		for(String reff20:ref20){
		System.out.println(reff20);
		}
		String[] ref21=ProductSearch.getBrandsByProduct("Paint");
		for(String reff21:ref21){
		System.out.println(reff21);
		}
		String[] ref22=ProductSearch.getBrandsByProduct("Foundation");
		for(String reff22:ref22){
		System.out.println(reff22);
		}
		String[] ref23=ProductSearch.getBrandsByProduct("Lipstick");
		for(String reff23:ref23){
		System.out.println(reff23);
		}
		String[] ref24=ProductSearch.getBrandsByProduct("Shampoo");
		for(String reff24:ref24){
		System.out.println(reff24);
		}
		String[] ref25=ProductSearch.getBrandsByProduct("Ac");
		for(String reff25:ref25){
		System.out.println(reff25);
		}
		String[] ref26=ProductSearch.getBrandsByProduct("Scotter");
		for(String reff26:ref26){
		System.out.println(reff26);
		}
		String[] ref27=ProductSearch.getBrandsByProduct("WallClock");
		for(String reff27:ref27){
		System.out.println(reff27);
		}
		
	}
}