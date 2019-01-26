import org.jsoup.safety.Whitelist;

public class XssWhiteListFactory {

	public static XssWhiteList of() {
		return new XssWhiteList().addTags("a", "br", "h1", "h2", "h3");
	}

	public static class XssWhiteList extends Whitelist {

		public XssWhiteList() {
			super();
		}

		@Override
		public XssWhiteList addTags(String... tags) {
			super.addTags(tags);
			return this;
		}
	}
}
