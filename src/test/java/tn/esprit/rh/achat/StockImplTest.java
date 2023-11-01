package tn.esprit.rh.achat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.services.IStockService;


import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

public class StockImplTest {
    @Autowired
    IStockService stockService;
    @Test
    @Order(1)
    public void testRetrieveAllstock() {
        List<Stock> listStocks = stockService.retrieveAllStocks();
        Assertions.assertEquals(0, listStocks.size());
    }
}
