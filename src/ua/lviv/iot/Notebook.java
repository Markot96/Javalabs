package ua.lviv.iot;

public class Notebook {

	private static final String DEFAULT_COVER_COLOR = "Red";

	private static final int DEFAULT_PAGES_QUANTITY = 48;

	private static final double DEFAULT_PRICE_IN_HRYVNIA = 64.37;

	private static final int DEFAULT_PRODUCTION_YEAR = 2015;

	private static final String DEFAULT_PRODUCTION_COUNTRY = "Ukraine";

	private static final int DEFAULT_PAGE_LENGTH_IN_MILLIMETERS = 210;

	private static final int DEFAULT_PAGE_WIDTH_IN_MILLIMETERS = 148;

	private static final int DENSITY_IN_GRAMMS_PER_SQUARE_METER = 80;
	
	private static final int LIVE_TIME_IN_DAYS = 400;

	private String coverColor;

	private int pagesQuantity;

	private double priceInHryvnia;

	private int productionYear;

	private String productionCountry;

	protected int pageLengthInMm;

	protected int pageWidthInMm;
	
	public static void newMethod() {}

	public String getCoverColor() {
		return coverColor;
	}

	public void setCoverColor(String coverColor) {
		this.coverColor = coverColor;
	}

	public int getPagesQuantity() {
		return pagesQuantity;
	}

	public void setPagesQuantity(int pagesQuantity) {
		this.pagesQuantity = pagesQuantity;
	}

	public double getPriceInHryvnia() {
		return priceInHryvnia;
	}

	public void setPriceInHryvnia(double priceInHryvnia) {
		this.priceInHryvnia = priceInHryvnia;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}

	public Notebook(String coverColor, int pagesQuantity, double priceInHryvnia, int productionYear,
			String productionCountry, int pageLengthInMm, int pageWidthInMm) {
		this.coverColor = coverColor;
		this.pagesQuantity = pagesQuantity;
		this.priceInHryvnia = priceInHryvnia;
		this.productionYear = productionYear;
		this.productionCountry = productionCountry;
		this.pageLengthInMm = pageLengthInMm;
		this.pageWidthInMm = pageWidthInMm;
	}

	public Notebook(String coverColor, int pagesQuantity, double priceInHryvnia, int productionYear) {
		this(coverColor, pagesQuantity, priceInHryvnia, productionYear, DEFAULT_PRODUCTION_COUNTRY,
				DEFAULT_PAGE_LENGTH_IN_MILLIMETERS, DEFAULT_PAGE_WIDTH_IN_MILLIMETERS);
	}

	public Notebook() {
		this(DEFAULT_COVER_COLOR, DEFAULT_PAGES_QUANTITY, DEFAULT_PRICE_IN_HRYVNIA, DEFAULT_PRODUCTION_YEAR,
				DEFAULT_PRODUCTION_COUNTRY, DEFAULT_PAGE_LENGTH_IN_MILLIMETERS, DEFAULT_PAGE_WIDTH_IN_MILLIMETERS);
	}

	@Override
	public String toString() {
		return "Notebook [coverColor=" + coverColor + ", pagesQuantity=" + pagesQuantity + ", priceInHryvnia="
				+ priceInHryvnia + ", productionYear=" + productionYear + ", productionCountry=" + productionCountry
				+ ", pageLengthInMm=" + pageLengthInMm + ", pageWidthInMm=" + pageWidthInMm + "]";
	}

	public static void printStaticDENSITY_IN_GRAMMS_PER_SQUARE_METER() {
		System.out.println("Density in gramms per square meter (static): " + DENSITY_IN_GRAMMS_PER_SQUARE_METER);
	}

	public void printDENSITY_IN_GRAMMS_PER_SQUARE_METER() {
		System.out.println("Density in gramms per square meter: " + DENSITY_IN_GRAMMS_PER_SQUARE_METER);
	}


	public void resetValues(String coverColor, int pagesQuantity, double priceInHryvnia, int productionYear,
			String productionCountry, int pageLengthInMm, int pageWidthInMm) {
		this.coverColor = coverColor;
		this.pagesQuantity = pagesQuantity;
		this.priceInHryvnia = priceInHryvnia;
		this.productionYear = productionYear;
		this.productionCountry = productionCountry;
		this.pageLengthInMm = pageLengthInMm;
		this.pageWidthInMm = pageWidthInMm;
	}

}
