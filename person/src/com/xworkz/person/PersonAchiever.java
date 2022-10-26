package com.xworkz.person;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.service.PersonService;
import com.xworkz.person.service.PersonServiceImpl;

public class PersonAchiever {

	public static void main(String[] args) {

		PersonDTO dto = new PersonDTO(1, "Chandru", "chandru6064@gmail.com", 8970816064L, 'M', "BE", false, false,
				"Be Ware Iam Rare", 2000000.0D, 24, 2.0D, "Somewhere in the World", "Somewhere the city is Unique",
				"Somewhere I decide", "Somewhere there is no Restrictions ", 436337588896L, "BIAPC0441G", false,
				35870847503L);
		PersonDTO dto1 = new PersonDTO(2, "honey", "honeyxworkz@gmail.com", 9148106365l, 'M', "BE", false, true,
				"will be decided", 10000000, 25, 3.2, "Aralikatti", "hubli", "karnataka", "india", 14785296333l,
				"CXSC1311ab", false, 12100008777883l);
		PersonDTO dto2 = new PersonDTO(3, "suhas", "suhasxworkz@gmail.com", 9148106366l, 'M', "BE", false, true,
				"Should decide", 1000000000, 26, 3.5, "where there is a way", "Shivamogga", "karnataka", "india",
				14785296334l, "CXSC1311bb", false, 12100008777884l);
		PersonDTO dto3 = new PersonDTO(4, "chandru", "chandruxworkz@gmail.com", 9148106367l, 'M', "BE", false, true,
				"innovative", 200000000, 24, 2.5, "dont know", "davanagere", "karnataka", "india", 14785296335l,
				"CXSC1311cb", false, 12100008777885l);
		PersonDTO dto4 = new PersonDTO(5, "dyamanna", "dyamannaxworkz@yahoo.com", 9148106368l, 'M', "BE", false, true,
				"creative", 300000000, 23, 2.5, "mudhol", "bagalkot", "karnataka", "india", 14785296336l, "CXSC1311eb",
				false, 12100008777886l);
		PersonDTO dto5 = new PersonDTO(6, "sharat", "sharatxworkz@gmail.com", 9148106369l, 'M', "Mtech", false, true,
				"builders", 25000, 26, 1, "vikas nagar", "hubli", "karnataka", "india", 14785296337l, "CXSC1311fb",
				false, 12100008777887l);
		PersonDTO dto6 = new PersonDTO(7, "manohar", "manoharxworkz@yahoo.com", 9148106379l, 'M', "BSc", false, true,
				"innovation", 20000, 22, 1, "navanagar", "kolar", "karnataka", "india", 14785296338l, "CXSC1311gb",
				false, 12100008777888l);
		PersonDTO dto7 = new PersonDTO(8, "kalyan", "kalyanxworkz@yahoo.com", 9148106389l, 'M', "BCA", false, true,
				"inflowsol", 26000, 28, 1, "whitefield", "bangalore", "karnataka", "india", 14785296339l, "CXSC1311hb",
				false, 12100008777889l);
		PersonDTO dto8 = new PersonDTO(9, "dharshan", "dharshanxworkz@yahoo.com", 9148106399l, 'M', "BE", false, true,
				"tremplien", 26000, 24, 1, "whitefield", "bangalore", "karnataka", "india", 14785296349l, "CXSC1311ib",
				false, 12100008777899l);
		PersonDTO dto9 = new PersonDTO(10, "manoj", "manojxworkz@yahoo.com", 9148106499l, 'M', "BE", false, true,
				"torry harris", 36000, 24, 1, "madhur", "mandya", "karnataka", "india", 14785296359l, "CXSC1311jb",
				false, 12100008777199l);
		PersonDTO dto10 = new PersonDTO(11, "divya", "divyaxworkz@gmail.com", 9148106599l, 'F', "BE", false, true,
				"oracle", 1000000, 25, 2.5, "navanagar", "chitradurga", "karnataka", "india", 14785296369l,
				"CXSC1311kb", false, 12100008777299l);
		PersonDTO dto11 = new PersonDTO(12, "vidya", "vidyaxworkz@gmail.com", 9148106699l, 'F', "BE", false, true,
				"wells fergo", 100000, 22, 1.3, "arvind nagar", "hubli", "karnataka", "india", 14785296379l,
				"CXSC1311lb", false, 12100008777399l);
		PersonDTO dto12 = new PersonDTO(13, "sushma", "sushmaxworkz@gmail.com", 9148106799l, 'F', "BE", false, true,
				"jp morgan", 100009, 23, 1.6, "madhur", "mandya", "karnataka", "india", 14785296389l, "CXSC1311mb",
				false, 12100008777499l);
		PersonDTO dto13 = new PersonDTO(14, "deepti", "deeptixworkz@gmail.com", 9148106899l, 'F', "BE", false, true,
				"microsoft", 100007, 21, 1.1, "in odisha", "odisha", "karnataka", "india", 14785296399l, "CXSC1311nb",
				false, 12100008777599l);
		PersonDTO dto14 = new PersonDTO(15, "shwetha", "shwethaxworkz@gmail.com", 9148106999l, 'F', "BE", false, true,
				"apple", 1000007, 24, 1.5, "shivaji nagar", "belgaum", "karnataka", "india", 14785296499l, "CXSC1311ob",
				false, 12100008777699l);
		PersonDTO dto15 = new PersonDTO(16, "laxmi", "laxmixworkz@gmail.com", 9148107999l, 'F', "BE", false, true,
				"smart stream", 1000008, 24, 1.7, "vijay nagar", "ramdurga", "karnataka", "india", 14785296599l,
				"CXSC1311pb", false, 12100008777799l);
		PersonDTO dto16 = new PersonDTO(17, "malatesh", "malateshxworkz@gmail.com", 9148106999l, 'M', "BE", false, true,
				"apple", 1000009, 23, 1.5, "kusugal", "hubli", "karnataka", "india", 14785296699l, "CXSC1311qb", false,
				12100008777899l);
		PersonDTO dto17 = new PersonDTO(18, "abhishek", "abhishekxworkz@gmail.com", 9148107999l, 'M', "BE", false, true,
				"wells fergo", 1000011, 26, 2.5, "deshpande nagar", "hubli", "karnataka", "india", 14785296799l,
				"CXSC1311rb", false, 12100008777999l);
		PersonDTO dto18 = new PersonDTO(19, "basavaraj", "basavarajxworkz@gmail.com", 9148108999l, 'M', "MSc", false,
				true, "jp morgan", 1000012, 26, 2.5, "hosur", "gadag", "karnataka", "india", 14785296899l, "CXSC1311sb",
				false, 12100008778999l);
		PersonDTO dto19 = new PersonDTO(20, "naresh", "nareshxworkz@gmail.com", 9148109999l, 'M', "BCA", false, true,
				"jmr it company", 1000013, 21, 1.1, "btm layout", "bangalore", "karnataka", "india", 14785296999l,
				"CXSC1311tb", false, 12100008779999l);
		PersonDTO dto20 = new PersonDTO(21, "parashuram", "parashuramxworkz@gmail.com", 9148119999l, 'M', "BE", false,
				true, "whiley edge", 1000014, 22, 1.3, "hsr layout", "bangalore", "karnataka", "india", 14785297999l,
				"CXSC1311ub", false, 12100008789999l);
		PersonDTO dto21 = new PersonDTO(22, "prashant", "prashantxworkz@gmail.com", 9148129999l, 'M', "BE", false, true,
				"input zero", 1000015, 25, 2.3, "hsr layout", "bangalore", "karnataka", "india", 14785298999l,
				"CXSC1311vb", false, 12100008799999l);
		PersonDTO dto22 = new PersonDTO(23, "pankaj", "pankajxworkz@gmail.com", 9148139999l, 'M', "BE", false, true,
				"cognizant", 1000016, 26, 2.3, "hosnagar", "sirsi", "karnataka", "india", 14785299999l, "CXSC1311wb",
				false, 12100008899999l);
		PersonDTO dto23 = new PersonDTO(24, "nagesh", "nageshxworkz@gmail.com", 9148149999l, 'M', "BE", false, true,
				"capegemini", 1000017, 22, 0.3, "mudhol", "bagalkot", "karnataka", "india", 14785399999l, "CXSC1311xb",
				false, 12100008999999l);
		PersonDTO dto24 = new PersonDTO(25, "sachin", "sachinxworkz@gmail.com", 9148159999l, 'M', "BE", false, true,
				"tata consultancy services", 1000018, 30, 2, "siver town", "ramdurga", "karnataka", "india",
				14785499999l, "CXSC1311yb", false, 12100009999999l);
		PersonDTO dto25 = new PersonDTO(26, "prajwal", "prajwalnairxworkz@gmail.com", 9148106364l, 'M', "BE", false,
				true, "google", 100000000, 25, 3, "ITPL", "Bengaluru", "Karnataka", "India", 14785296332l, "CXSC1311db",
				false, 12100008777882l);

		PersonService personService = new PersonServiceImpl();
		personService.validateAndSave(dto);
		personService.validateAndSave(dto1);
		personService.validateAndSave(dto2);
		personService.validateAndSave(dto3);
		personService.validateAndSave(dto4);
		personService.validateAndSave(dto5);
		personService.validateAndSave(dto6);
		personService.validateAndSave(dto7);
		personService.validateAndSave(dto8);
		personService.validateAndSave(dto9);
		personService.validateAndSave(dto10);
		personService.validateAndSave(dto11);
		personService.validateAndSave(dto12);
		personService.validateAndSave(dto13);
		personService.validateAndSave(dto14);
		personService.validateAndSave(dto15);
		personService.validateAndSave(dto16);
		personService.validateAndSave(dto17);
		personService.validateAndSave(dto18);
		personService.validateAndSave(dto19);
		personService.validateAndSave(dto20);
		personService.validateAndSave(dto21);
		personService.validateAndSave(dto22);
		personService.validateAndSave(dto23);
		personService.validateAndSave(dto24);
		personService.validateAndSave(dto25);

		System.out.println("================================");
		personService.displayAll();

		System.out.println("================================");
		personService.displayAllAgeGreaterThanOrderByName(23);

		System.out.println("================================");
		personService.displayAllGenderDescOrderByName('M');

		System.out.println("================================");
		personService.displayAllSalaryGreaterThanorderByDesc(0);

		System.out.println("================================");
		personService.displayCount();

		System.out.println("================================");
		personService.displaySumOfSalary();
	}

}