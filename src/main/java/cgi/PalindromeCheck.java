package cgi;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PalindromeCheck {

	public static void main(String[] args) {
		//testone();
		//primecheck();
		//amstrongnumber();
		//fibonacciseries();
		//factorial();
		//secondlargestnumber();
		//maxValue();
		//reverseanumber();
		//reverseastring();
		//reverseonlyoddlengthvalues();
		//waitrelatedscenario();
		brokenlinks();

	}

	private static void brokenlinks() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(WebElement links:link) {
			String l=links.getAttribute("href");
			if(l == null || l.isEmpty() || l.contains("javascript")) {
				continue;
			}
			try {
				URL url=new URL(l);
				HttpURLConnection http=(HttpURLConnection) url.openConnection();
				http.setConnectTimeout(2000);
				http.connect();
				int responsecode=http.getResponseCode();
				if(responsecode >=400) {
					System.out.println(l+":its a broken link"+"status code:"+responsecode);
				}else {
					System.out.println(l+":its a valid link"+"status code:"+responsecode);
				}
				http.disconnect();
				
			}catch(Exception e) {
				System.out.println(l + " -> Exception occurred");
			}
		}
		
	}

	private static void waitrelatedscenario() {
		WebDriver driver;
		
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		FluentWait<WebDriver> waitone=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	}

	private static void reverseonlyoddlengthvalues() {
		String value="he is an test automationa engineer";
		String values[]=value.split("\\s+");
		StringBuffer stb=new StringBuffer();
		
		for(String val:values) {
			if(val.length()%2 !=0) {
				stb.append(new StringBuffer().append(val).reverse());
			}else {
				stb.append(val);
			}
			stb.append(" ");
		}
		System.out.print(stb.toString());
		
	}

	private static void reverseastring() {
		String value="rithesh";
		char[] ch=value.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.print(rev);
		
	}

	private static void reverseanumber() {
		int number=123;
		int rev=0;
		
		while(number !=0) {
			int temp=number%10;
			rev=rev*10+temp;
			number=number/10;
		}
		System.out.print(rev);
		
	}

	private static void maxValue() {
		int arr[]= {1,21,3,4,5};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

	private static void secondlargestnumber() {
		int arr[]= {1,2,3,4,5,6};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > first) {
				second=first;
				first=arr[i];
			}else if(arr[i] > second && arr[i] != first) {
				second=arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		
	}

	private static void factorial() {
		int num=5;
		
		for(int i=1;i<=num;i++) {
			num=i*(i-1);
		}
		
	}

	private static void fibonacciseries() {
		int n1=0,n2=1;
//		System.out.print(n1+" "+n2+" ");
//		for(int i=2;i<=5;i++) {
//			int n3=n1+n2;
//			System.out.print(n3+" ");
//			n1=n2;
//			n2=n3;
//		}
		int count=5;
		for (int i = 1; i <= count; i++) {
		    System.out.print(n1);

		    if (i < count) {   // avoid last space
		        System.out.print(" ");
		    }

		    int n3 = n1 + n2;
		    n1 = n2;
		    n2 = n3;
		}
		
	}

	private static void amstrongnumber() {
		int num=123;
		int original=num;
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
		}
		if(original == sum) {
			System.out.print("its an amstrong number");
		}else {
			System.out.print("its not an amstrong number");
		}
		
	}

	private static void primecheck() {
		int n=12;
		boolean prime=true;
		
		if(n<=1) {
			prime=false;
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%2 == 0) {
					prime=false;
					break;
				}
			}
		}
		if(prime) {
			System.out.println("its a prime number");
		}else {
			System.out.println("its not a prime number");
		}
		
		
		
	}

	private static void testone() {
		int number=121;
		int original=number;
		int reversed=0;
		
		while(number!=0) {
			int digit =number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		if(original == reversed) {
			System.out.println("its a palindrome number");
			}else {
				System.out.println("its not a palindrome number");
			}
		
	}

}
