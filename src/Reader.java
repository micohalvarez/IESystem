import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class Reader {


	private ArrayList<String> number;
	private ArrayList<String> stdControl;
	private ArrayList<String> action;
	private ArrayList<String> control;
	private ArrayList<String> asset;
	private ArrayList<String> org;
	private ArrayList<String> vulnerable;
	private ArrayList<String> severity;
	private ArrayList<String> threat;
	private ArrayList<String> security;
	private ArrayList<String> threatSource;
	private ArrayList<String> threatOrigin;
	private ArrayList<String> sentence;
	private ArrayList<String> tp, fp, tn, fn;


	public Reader() {
		stdControl = new ArrayList<>();
		number = new ArrayList<>();
		action = new ArrayList<>();
		control = new ArrayList<>();
		asset = new ArrayList<>();
		org = new ArrayList<>();
		vulnerable = new ArrayList<>();
		severity = new ArrayList<>();
		threat = new ArrayList<>();
		security = new ArrayList<>();
		threatSource = new ArrayList<>();
		threatOrigin = new ArrayList<>();
		sentence = new ArrayList<>();

		createHeader();
		init();
	}

	public void init() {

		try {
			CSVReader reader = new CSVReader(new FileReader("hi.csv"));
			String[] nextLine;

			while ((nextLine = reader.readNext()) != null) {
				number.add(nextLine[3]);
				sentence.add(nextLine[5]);
				stdControl.add(nextLine[1]);
				control.add(nextLine[4]);
				asset.add("");
				org.add("");
				action.add("");
				vulnerable.add("");
				severity.add("");
				threat.add("");
				security.add("");
				threatSource.add("");
				threatOrigin.add("");

			}

			for (int i = 0; i < sentence.size(); i++)
				sentence.set(i, sentence.get(i).replaceAll("- ", ""));

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println("CSV Read Complete");


	}

	public void init2() {

		try {
			CSVReader reader = new CSVReader(new FileReader("data.csv"));
			String[] nextLine;

			while ((nextLine = reader.readNext()) != null) {
				number.add(nextLine[3]);
				sentence.add(nextLine[5]);
				stdControl.add(nextLine[1]);
				control.add(nextLine[4]);
				asset.add("");
				org.add("");
				action.add("");
				vulnerable.add("");
				severity.add("");
				threat.add("");
				security.add("");
				threatSource.add("");
				threatOrigin.add("");
			}


		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println("CSV Read Complete");


	}

	public ArrayList<String> getSentence() {
		return sentence;
	}

	public void setSentence(ArrayList<String> sentence) {
		this.sentence = sentence;
	}

	public void createHeader() {
		stdControl.add("Standard Control");
		control.add("Control");
		number.add("#");
		action.add("Action");
		asset.add("Asset");
		org.add("Organization");
		vulnerable.add("Vulnerability");
		severity.add("Severity Scale");
		threat.add("Threat");
		security.add("Security Attribute");
		threatSource.add("Threat Source");
		threatOrigin.add("Threat Origin");
//		tp.add("True Positive");
//		tn.add("True Negative");
//		fp.add("False Positive");
//		fn.add("False Negative");
	}


	public ArrayList<String> getAction() {
		return action;
	}

	public void setAction(ArrayList<String> action) {
		this.action = action;
	}

	public ArrayList<String> getControl() {
		return control;
	}

	public void setControl(ArrayList<String> control) {
		this.control = control;
	}

	public ArrayList<String> getAsset() {
		return asset;
	}

	public void setAsset(ArrayList<String> asset) {
		this.asset = asset;
	}

	public ArrayList<String> getOrg() {
		return org;
	}

	public void setOrg(ArrayList<String> org) {
		this.org = org;
	}

	public ArrayList<String> getVulnerable() {
		return vulnerable;
	}

	public void setVulnerable(ArrayList<String> vulnerable) {
		this.vulnerable = vulnerable;
	}

	public ArrayList<String> getSeverity() {
		return severity;
	}

	public void setSeverity(ArrayList<String> severity) {
		this.severity = severity;
	}

	public ArrayList<String> getThreat() {
		return threat;
	}

	public void setThreat(ArrayList<String> threat) {
		this.threat = threat;
	}

	public ArrayList<String> getSecurity() {
		return security;
	}

	public void setSecurity(ArrayList<String> security) {
		this.security = security;
	}

	public ArrayList<String> getThreatSource() {
		return threatSource;
	}

	public void setThreatSource(ArrayList<String> threatSource) {
		this.threatSource = threatSource;
	}

	public ArrayList<String> getThreatOrigin() {
		return threatOrigin;
	}

	public void setThreatOrigin(ArrayList<String> threatOrigin) {
		this.threatOrigin = threatOrigin;
	}

	public ArrayList<String> getNumber() {
		return number;
	}

	public void setNumber(ArrayList<String> number) {
		this.number = number;
	}

	public ArrayList<String> getStdControl() {
		return stdControl;
	}

	public void setStdControl(ArrayList<String> stdControl) {
		this.stdControl = stdControl;
	}

	public ArrayList<String> getTp() {
		return tp;
	}

	public void setTp(ArrayList<String> tp) {
		this.tp = tp;
	}

	public ArrayList<String> getFp() {
		return fp;
	}

	public void setFp(ArrayList<String> fp) {
		this.fp = fp;
	}

	public ArrayList<String> getTn() {
		return tn;
	}

	public void setTn(ArrayList<String> tn) {
		this.tn = tn;
	}

	public ArrayList<String> getFn() {
		return fn;
	}

	public void setFn(ArrayList<String> fn) {
		this.fn = fn;
	}


}
