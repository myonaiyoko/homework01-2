import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestSinchokuDodesuka {

	@Test
	public void test() {
		assertThat(SinchokuDodesuka.getSinchokuDodesuka().indexOf("進捗どうですか？") != -1,is(true));
	}

}
