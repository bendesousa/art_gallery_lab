import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery GalleryTest;

    @Test
    public void ShowName () {
//        Given
        Gallery Gallery = new Gallery ("London Gallery", 2000 );
//        When
        String actual = Gallery.getName();
//        Then
        String expected = "London Gallery";

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void  ShowTill(){
        Gallery Gallery = new Gallery("London Gallery", 2000);
        int actual = Gallery.getTill();
        int expected = 2000;

        assertThat(actual).isEqualTo(expected);
    }


}
