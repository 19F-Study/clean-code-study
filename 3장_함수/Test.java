public class Test {

	public static void main(String[] args) {

		BulletinService bulletinService = new BulletinService();
		XssFilter xssFilter = new XssFilter();
		Bulletin bulletin = new Bulletin();

		bulletin.setTitle("상품이 이상해요!");
		bulletin.setContent("<img src=#/><button></button><a></a>");

		String filteredContent = xssFilter.filter(bulletin.getContent());
		bulletin.setContent(filteredContent);

		bulletinService.save(bulletin);
	}

}
