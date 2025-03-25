class ProductSearch{
	public static double getPriceByProduct(String productName){
		if(productName=="Earbuds"){
			double cost=2223.44;
			return cost; 
		}
		else if(productName=="Speakers"){
			double cost1=3334.55;
			return cost1; 
		}
		else if(productName=="Watch"){
			double cost2=3334.45;
			return cost2; 
		}
		else if(productName=="PowerBank"){
			double cost3=3333.55;
			return cost3; 
		}
		else if(productName=="Kettle"){
			double cost4=3344.55;
			return cost4; 
		}
		else if(productName=="Blender"){
			double cost5=3434.55;
			return cost5; 
		}
		else if(productName=="Gaming Headset"){
			double cost6=3444.55;
			return cost6; 
		}
		else if(productName=="Sunglasses"){
			double cost7=3334.65;
			return cost7; 
		}
		else if(productName=="Perfume"){
			double cost8=3534.55;
			return cost8;
		}
		else if(productName=="Sneakers"){
			double cost9=3684.55;
			return cost9; 
		}
		else if(productName=="Sandals"){
			double cost10=3234.55;
			return cost10; 
		}
		else if(productName=="Jacket"){
			double cost11=1334.55;
			return cost11;
		}
		else if(productName=="Hat"){
			double cost12=3304.55;
			return cost12; 
		}
		
		else if(productName=="Jeanspant"){
			double cost13=2334.55;
			return cost13; 
		}
		else if(productName=="Braclet"){
			double cost14=3334.55;
			return cost14; 
		}
		else if(productName=="Handbag"){
			double cost15=3344.55;
			return cost15; 
		}
		else if(productName=="Slingbag"){
			double cost16=3654.55;
			return cost16; 
		}
		else if(productName=="Compact"){
			double cost17=3334.05;
			return cost17; 
		}
		else if(productName=="Foundation"){
			double cost18=3934.55;
			return cost18; 
		}
		else if(productName=="Lipstick"){
			double cost19=3364.55;
			return cost19; 
		}
		else if(productName=="Mousepad"){
			double cost20=3334.15;
			return cost20; 
		}
		else if(productName=="Coat"){
			double cost21=3300.55;
			return cost21; 
		}
		else if(productName=="Bed"){
			double cost22=3034.55;
			return cost22; 
		}
		
		else{
			return 0;
		}
		
		}
		public static void searchProductAvailability(String productName) {
    if (productName == "Earbuds") {
        String availability= "In Stock";
		
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Speakers") {
        String availability= "Out of Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Watch") {
        String availability= "Limited Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "PowerBank") {
        String availability= "In Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Kettle") {
        String availability= "In Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Blender") {
        String availability= "Out of Stock";
       
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Gaming Headset") {
        String availability= "Limited Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Sunglasses") {
        String availability= "In Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Perfume") {
        String availability= "Out of Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else if (productName == "Sneakers") {
        String availability= "In Stock";
        
        System.out.println("Product: " + productName + " - Availability: " + availability);
    } else {
        String availability= "Not Available";
        System.out.println("Product: " + productName + " - Availability: " + availability);
    }
}
public static String[] getBrandsByProduct(String productName) {
    if (productName == "Earbuds") {
        String[] brands1 = {"Sony", "Bose", "JBL"};
        return brands1;
    } else if (productName == "Speakers") {
        String[] brands2 = {"JBL", "Sony", "Bose"};
        return brands2;
    } else if (productName == "Watch") {
        String[] brands3 = {"Apple", "Samsung", "Garmin"};
        return brands3;
    } else if (productName == "PowerBank") {
        String[] brands4 = {"Anker", "Xiaomi", "Samsung"};
        return brands4;
    } else if (productName == "Kettle") {
        String[] brands5 = {"Philips", "Prestige", "Morphy Richards"};
        return brands5;
    } else if (productName == "Blender") {
        String[] brands6 = {"NutriBullet", "Philips", "Oster"};
        return brands6;
    } else if (productName == "Gaming Headset") {
        String[] brands7 = {"Razer", "SteelSeries", "Logitech"};
        return brands7;
    } else if (productName == "Sunglasses") {
        String[] brands8 = {"Ray-Ban", "Oakley", "Gucci"};
        return brands8;
    } else if (productName == "Perfume") {
        String[] brands9 = {"Chanel", "Dior", "Gucci"};
        return brands9;
    } else if (productName == "Sneakers") {
        String[] brands10 = {"Nike", "Adidas", "Puma"};
        return brands10;
    } else if (productName == "Milk") {
        String[] brands11 = {"Nandini", "Hatson", "Milkymist"};
        return brands11;
    }else if (productName == "Umbrella") {
        String[] brands12 = {"Johns", "Poppy", "H&M"};
        return brands12;
    }else if (productName == "Scotter") {
        String[] brands13 = {"Vespa", "Dio", "Wego"};
        return brands13;
    }else if (productName == "Sarees") {
        String[] brands14 = {"Temple", "KalyanSilk", "Sudharshan"};
        return brands14;
    }else if (productName == "Foundation") {
        String[] brands15 = {"FitMe", "Lakme", "Huda"};
        return brands15;
    }else if (productName == "Shampoo") {
        String[] brands16 = {"Dove", "medimix", "Patanjali"};
        return brands16;
    }else if (productName == "LipStick") {
        String[] brands17 = {"Lakme", "Huda", "Oriflame"};
        return brands17;
    }else if (productName == "Perfumes") {
        String[] brands18 = {"Yardley", "Fogg", "Watergirl"};
        return brands18;
    }else if (productName == "Cement") {
        String[] brands19 = {"Ambuja", "AC", "Birla"};
        return brands19;
    }else if (productName == "Ac") {
        String[] brands20 = {"Samsung", "Panasonic", "LG"};
        return brands20;
    }else if (productName == "Paint") {
        String[] brands21 = {"Nippon", "Asian", "Nerolac"};
        return brands21;
    }else if (productName == "FlipFlops") {
        String[] brands22 = {"Nike", "Crocs", "Puma"};
        return brands22;
    }else if (productName == "SmartPhone") {
        String[] brands23 = {"Apple", "Samsung", "Nokia"};
        return brands23;
    }else if (productName == "Laptop") {
        String[] brands24 = {"Dell", "HP", "Lenovo"};
        return brands24;
    }else if (productName == "Tshirt") {
        String[] brands25 = {"Nike", "Adidas", "Puma"};
        return brands25;
    }else {
        String[] brands26 = {"No Brands Available"};
        return brands26;
    }
}

}