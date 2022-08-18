import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

 private Artist artist;
    @Test
    public void showArtistName(){
        //Given
        Artist artist = new Artist("John");
        //When
        String actual = artist.getName();
        //Then
        String expected = "John";

        assertThat(actual).isEqualTo(expected);
    }



}





