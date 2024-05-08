package worldsPopulation;

import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Challange1 {

	WebDriver driver;

	@Test
	public void test1() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		   LocalTime currentTime = LocalTime.now();
		   int currentSecond = currentTime.getSecond();
		   
		   System.out.println(currentSecond);
		   if(currentSecond>40)
		      currentSecond=currentSecond-40;
		   else
			   currentSecond+=20;
		   System.out.println("After current --> "+currentSecond);
		   Thread.sleep(1000);
		 WebElement pop=driver.findElement(By.className("maincounter-number"));
		 WebElement lSide=driver.findElement(By.xpath("//div[@class='col1in']"));
		 WebElement rSide=driver.findElement(By.xpath("//div[@class='col2in']"));
		while (true) {
	         
			System.out.println(LocalTime.now().getSecond()+" "+currentSecond);
			if(LocalTime.now().getSecond()==currentSecond)
			{
				System.out.println("Terminated");
				break;
			}
			
			 System.out.print(pop.getText()+"\n"+lSide.getText()+"\n"+rSide.getText());
			 Thread.sleep(1000);
			 System.out.println("\n====================================================");
			

		}
		
	}
}
