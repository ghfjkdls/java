package lab1;

import java.lang.Math;   

public class konsola{
	public static void main(String[] args) {
		int capacity, n,sumWeight=0, sumValue=0, loop=0;
		
		n = (int)(Math.random()*(15-5+1)+5);
		capacity = (int)(Math.random()*(200-30+1)+30);
		
		System.out.print("ilosc przedmiotow "+n+"  "+"pojemnosc "+capacity+"\n");
		
		Item items[] = new Item[n];
		
		for(int i=0; i<n; i++) {
			items[i] = new Item((int)(Math.random()*(20-10+1)+10), (int)(Math.random()*(20-10+1)+10));
			System.out.print("przedmiot "+i+" waga"+items[i].weight+"  "+"wartosc "+items[i].value+"\n");
		}
		
		for(int i=0; i<n; i++) {
			if(sumWeight+items[i].weight < capacity) {
				loop++;
				sumWeight += items[i].weight;
				sumValue  += items[i].value;
			}else break;
		}
		System.out.print("suma wagi "+sumWeight+" suma wartosci "+sumValue+"\n");
		System.out.print("wlozone przedmioty\n");


		for(int i=0; i<loop; i++) {
			System.out.print("przedmiot "+i+" waga"+items[i].weight+"  "+"wartosc "+items[i].value+"\n");
		}
		
		
	}
}
