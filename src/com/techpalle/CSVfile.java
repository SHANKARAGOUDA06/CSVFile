package com.techpalle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVfile 
{
	public static void main(String[] args)
	{
	        String csvFile = "data.csv";
	        
	        FileWriter writer = null;
	        
	        List<String[]> data = new ArrayList<String[]>();
	        
	        
	        data.add(new String[]{"Product Name","Product Price","SKU", "Model Number","Product Category","Product Description"});
	        data.add(new String[]{"Dell G15 15.6","$859.99","windows 11","G15RE-A975G","Gaming Notebook","The powerful AMD Ryzen 7 processor features machine intelligence that anticipates.Graphics Backed by 4GB GDDR6 dedicated video memory for a fast,advanced GPU to fuel your games."});
	        data.add(new String[]{"Dell G15 15","$1109.00","windows 11","G15","Gaming Notebook","FHD 120Hz Display AMD Octa-Core Ryzen 7 5800H 8GB DDR4 512GB SSD GeForce RTX 3050 Ti 4GB Backlit Keyboard HDMI USB-C WiFi6 Nahimic Win11"});
	        data.add(new String[]{"Dell G3 15","$888.00","windows 10","15 3500","Gaming Notebook","Intel Core i5 10300H / 2.5 GHz - Win 10 Home 64-bit - GF GTX 1650 Ti - 8 GB RAM - 512 GB SSD NVMe - 15.6\" 1920 x 1080 (Full HD) @ 120 Hz - Wi-Fi 5 - black"});
	        data.add(new String[]{"Dell G7","$1199.95","windows 11","GTX 1060","Gaming Notebook","Used - Dell G7 15 7588 (Intel i7-8750H (Six-Core), Nvidia GTX 1060, 16Gb, 512Gb SSD)"});
	        data.add(new String[]{"Dell Inspiron","$1299.00","windows 11","15-7559","Gaming Notebook","Dell Inspiron 15.6\" Full HD Laptop, Intel Core i7 i7-6700HQ, 1TB HD, Windows 10 Home, 15-7559"});
	        data.add(new String[]{"Dell G7 17 7790","$1399.99","windows 10","G7790-5695GRY-PUS","Gaming Notebook","Dell G7 17 7790 Gaming Laptop, 17.3'' FHD, Intel Core i5-9300H, NVIDIA GeForce RTX 2060, 8GB RAM, 128 GB SSD + 1TB HDD, Windows 10 Home, G7790-5695GRY-PUS (Google Classroom Compatible)"});
	        data.add(new String[]{"Dell XPS 15 7590","$1999.00","windows 11","15 7590","Gaming Notebook","Intel Core i7 9750H / 2.6 GHz - Win 10 Home 64-bit - GF GTX 1650 - 16 GB RAM - 512 GB SSD NVMe - 15.6\" IPS touchscreen 3840 x 2160 (Ultra HD 4K) - Wi-Fi 6 - silver"});
	        data.add(new String[]{"MSI GF63 ","$749.00","windows 11","GF63 Thin 11UC-692","Gaming Notebook","Thin 11UC-692 15.6, 144Hz, Intel Core i5-11400H, NVIDIA GeForce RTX 3050, 8GB Memory, 512GB NVMe SSD, Windows 11"});
	        data.add(new String[]{"MSI Stealth GS66","$1999.99","windows 11","GS66 12UGS-039","Gaming Notebook","  QHD 240Hz, Intel Core i9-12900H, NVIDIA GeForce RTX 3070 Ti, 32GB RAM, 1TB SSD, Windows 11 Home, Stealth GS66 12UGS-039"});
	        data.add(new String[]{"MSI Katana GF76","$1047.00","windows 11","11UD-001","Gaming Notebook","FHD, Intel Core i7-11800H, NVIDIA GeForce RTX 3050 Ti, 16GB RAM, 512GB NVMe SSD, Black, Windows 10, 11UD-001"});
	        
	        try 
	        {
	            
	        	writer = new FileWriter(csvFile);
	            for (String[] row : data)
	            {
	                writer.append(String.join(",", row));
	                writer.append("\n");
	            }
	            System.out.println("Data has been written to " + csvFile);
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error while writing CSV file: " + e.getMessage());
	        } 
	        finally
	        {
	            try
	            {
	                writer.flush();
	                writer.close();
	            } 
	            catch (IOException e)
	            {
	                System.out.println("Error while flushing/closing writer: " + e.getMessage());
	            }
	       }
	}
}
