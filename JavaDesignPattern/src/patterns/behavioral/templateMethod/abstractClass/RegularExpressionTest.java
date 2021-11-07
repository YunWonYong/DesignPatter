package patterns.behavioral.templateMethod.abstractClass;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class RegularExpressionTest {
	private final String DEFAULT_FORMAT = "^[#]+[\\-\\.\\,\\@\\/\\:\\+\\=]?([#]{1,}[\\-\\.\\,\\@\\/\\:\\+\\=]{1})*[#]+$";
	

	@Test
	void test() {
		assertTrue("구분자 없음", "########".matches(DEFAULT_FORMAT));
		assertTrue("전화번호", "###-####-####".matches(DEFAULT_FORMAT)); 
		assertTrue("이메일", "#######@#####.##".matches(DEFAULT_FORMAT));
		assertTrue("날짜", "####.##.##".matches(DEFAULT_FORMAT));
		assertTrue("날짜2", "####/##/##".matches(DEFAULT_FORMAT));
		assertTrue("시간", "##:##:##".matches(DEFAULT_FORMAT)); 
		assertTrue("시간2", "##:##:##.###".matches(DEFAULT_FORMAT));
		
		assertFalse("prefix", "-########".matches(DEFAULT_FORMAT));
		assertFalse("구분자 2개 연속", "-######..##".matches(DEFAULT_FORMAT));
		assertFalse("구분자 2개 연속2", "##..######".matches(DEFAULT_FORMAT));
		assertFalse("subfix","########-".matches(DEFAULT_FORMAT));
		assertFalse("지원하지 않은 구분자", "#####%###".matches(DEFAULT_FORMAT));
	}
	
	@Test
	void inputTest() {
		assertFalse("문자 검증", "#-##-###-###".matches("[^\\#\\-\\.\\,\\@\\/\\:\\+\\=]"));
		assertTrue("문자 검증2", "#-#1#-#2##-#3##".replaceAll("[\\#\\,\\.\\-\\=\\+\\@\\:]" ,"").length() > 0);
	}

}
