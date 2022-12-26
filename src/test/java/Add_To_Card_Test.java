
import org.example.*;
import org.example.Log.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Add_To_Card_Test  extends BaseTest{
    Logger log = new Logger();
    HomePage HomePage;
    ShopPage ShopPage;
    AddCardPage AddCardPage;
    ContainerSee ContainerSee;
    Container Container;
    ShopAnd ShopAnd;
    Subscribe susbs;

    @Test
    @Order(1)
    public  void search(){
        HomePage= new HomePage(driver);
         ShopPage = new ShopPage(driver);
        HomePage.search("mama");
      Assertions.assertTrue(ShopPage.isOnShopPage()," arama sonuçları görünmüyor! ");
    }
    @Test
    @Order(2)
    public void selecet(){
        //seçme methodu
        ShopPage= new ShopPage(driver);
        AddCardPage=new AddCardPage(driver);
        ShopPage.Select(1);
       Assertions.assertTrue(AddCardPage.isOnAddCard()," sepete ekleme ekranı çıkmadı !");

    }
    @Test
    @Order(3)
    public  void Add(){
        ContainerSee = new ContainerSee(driver);
        Container = new Container(driver);
        ContainerSee.Selecet();
        Assertions.assertTrue(Container.isOnConatiner()," Sepeti göremedi! ");

    }
    @Test
    @Order(4)
    public  void goToCard(){
        susbs = new Subscribe(driver);
        ShopAnd= new ShopAnd(driver);
        ShopAnd.end();
        Assertions.assertTrue(susbs.isOnSubs()," üye ol ekranı bulunamadı");


    }

}
