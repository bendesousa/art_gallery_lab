import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    private Customer customer;

    @Test
    public void getCustomerName(){
        //Given
        Customer customer = new Customer(100, "Fred");
        //When
        String actual = customer.getName();
        //Then
        String expected = "Fred";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getCustomerWallet(){
        //Given
        Customer customer = new Customer(200, "Sam");
        //When
        int actual = customer.getWallet();
        //Then
        int expected = 200;

        assertThat(actual).isEqualTo(expected);
    }
}
