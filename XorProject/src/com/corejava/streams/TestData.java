package com.corejava.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class TestData {
	
	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 30, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 60, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		//1.	Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
        System.out.println("-------------------");
		List<Fruit> lowCal = getAllFruits().stream() 
				.filter(calories -> calories.getCalories() < 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.collect(Collectors.toList()); 
		lowCal.stream().forEach(System.out::println);
        System.out.println("-------------------");
		
		//2.	Display color wise list of fruits.
        System.out.println("-------------------");
        Map<String,List<Fruit>> fruit1 = getAllFruits().stream() 
				.collect(Collectors.groupingBy(Fruit::getColor)); 
		fruit1.entrySet().forEach(System.out::println);
        System.out.println("-------------------");
		//3.	Display only RED color fruits sorted as per their price in ascending order
        System.out.println("-------------------");
		List<Fruit> fruitRed = getAllFruits().stream() 
				.filter(redColor->redColor.getColor().equals("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice))
				.collect(Collectors.toList()); 
		fruitRed.stream().forEach(System.out::println);
        System.out.println("-------------------");
		//4.	Find out the newsId which has received maximum comments.
        System.out.println("-------------------");
		int maxComments = getAllNews().stream() 
                .collect(Collectors.groupingBy(News::getNewsId,counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    System.out.println(maxComments);

    System.out.println("-------------------");
		
		//6.	Display commentByUser wise number of comments.
    	System.out.println("-------------------");
		Map<String,Long> commentUser= getAllNews().stream()
				.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
		commentUser.entrySet().forEach(System.out::println);
        System.out.println("-------------------");
		
		//7.	Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("-------------------");
		List<Transaction> trader = getAllTransactions().stream()
				.filter(year->year.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		trader.stream().forEach(System.out::println);
        System.out.println("-------------------");
		
		//8.	What are all the unique cities where the traders work?
        System.out.println("-------------------");
		List<String> trader1 = getAllTransactions().stream()
				.map(Transaction::getTrader)
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		trader1.stream().forEach(System.out::println);
        System.out.println("-------------------");
		
		//9.	Find all traders from Pune and sort them by name.
        System.out.println("-------------------");
		List<Transaction> traderPune = getAllTransactions().stream()
				.filter(city->city.getTrader().getCity().equals("Pune"))
				.sorted(Comparator.comparing(t->t.getTrader().getName()))
				.collect(Collectors.toList());
		traderPune.stream().forEach(System.out::println);
        System.out.println("-------------------");
        //10.	Return a string of all traders� names sorted alphabetically.
        System.out.println("-------------------");
      		List<Transaction> traders = getAllTransactions().stream()
      				.sorted(Comparator.comparing(t->t.getTrader().getName()))
      				.collect(Collectors.toList());
      		traders.stream().forEach(System.out::println);
              System.out.println("-------------------");
		
		//11.	Are any traders based in Indore?
              boolean isIndore = getAllTransactions().stream()
            		  .anyMatch(t->t.getTrader().getCity().equals("Indore"));
                System.out.println(isIndore);
                
         //12.	Print all transactions� values from the traders living in Delhi.
            	getAllTransactions().stream()
        				.filter(city->city.getTrader().getCity().equals("Delhi"))
        				.forEach(city->System.out.println(city.getValue()));
                System.out.println("-------------------");
                
        // 13.	What�s the highest value of all the transactions?
                Optional<Integer> max=getAllTransactions().stream()
                		.map(Transaction::getValue)
                		.reduce(Integer::max)
                		;
                System.out.println(max.get());
           
        //14.	Find the transaction with the smallest value.
                
                Optional<Integer> min=getAllTransactions().stream()
                		.map(Transaction::getValue)
                		.reduce(Integer::min)
                		;
                System.out.println(min.get());
              
        //15.	Find out which user has posted maximum comments
       
	} 
}
