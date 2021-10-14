package com.example.profili;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dimi {

	@Test
	public void eq() {
		assertThat("36", equalTo("36"));
	}
}
