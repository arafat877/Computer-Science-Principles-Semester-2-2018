
public class TestInvoiceItem {

	public static void main(String[] args) {
		InvoiceItem item = new InvoiceItem("21041", "This is a drone", 32, 410);
		
		System.out.println(item.getTotal());
		
		System.out.println(item);

	}

}
