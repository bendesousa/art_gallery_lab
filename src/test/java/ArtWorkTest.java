import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtWorkTest {

    private ArtWork artWork;

    @BeforeEach
    public void setUp() {
        this.artWork = new ArtWork("Blue Sky", "John", 50, 573);
    }

    @Test
    public void getArtWorkTitle() {
        String actual = artWork.getTitle();
        String expected = "Blue Sky";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getArtWorkArtist() {
        String actual = artWork.getArtist();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void getArtWorkPrice() {
        int actual = artWork.getPrice();
        int expected = 50;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getArtWorkNft() {
        int actual = artWork.getNft();
        int expected = 573;

        assertThat(actual).isEqualTo(expected);


    }

}
