package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product2 = new Product("ziemniaki");
        Product product3 = new Product("buraki");

        Item item = new Item(product3,new BigDecimal(5) ,1);
        Item item2 = new Item(product2, new BigDecimal(7), 2);



        Invoice invoiceList = new Invoice("001/010/2021");
        invoiceList.getItems().add(item);
        invoiceList.getItems().add(item2);
        item.setInvoice(invoiceList);
        item2.setInvoice(invoiceList);


        //When
        invoiceDao.save(invoiceList);
        int id = invoiceList.getId();

        //Then
        assertNotEquals(0, id);


        //CleanUp
        //invoiceDao.deleteById(id);
    }
}
