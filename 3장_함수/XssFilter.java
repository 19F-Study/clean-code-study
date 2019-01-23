import org.jsoup.Jsoup;

public class XssFilter {
	private XssWhiteListFactory.XssWhiteList xssWhiteList = XssWhiteListFactory.of();

	public String filter(String before) {
		String after = before;
		if (!Jsoup.isValid(before, xssWhiteList)) {
			after = Jsoup.clean(before, xssWhiteList);
			System.out.println(String.format("before : %s", before));
			System.out.println(String.format("after : %s", after));
		}
		return after;
	}
}
