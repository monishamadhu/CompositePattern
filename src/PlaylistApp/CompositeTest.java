package PlaylistApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void test() {
		Playlist pl = new Playlist("Tharaattu");
		String output = pl.getName();
		assertEquals("Tharaattu",output);
	}

}
