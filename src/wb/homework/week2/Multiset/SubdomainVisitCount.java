package wb.homework.week2.Multiset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {


	/*
	 * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level,
	 *  we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com",
	 *   we will also visit the parent domains "leetcode.com" and "com" implicitly.

		Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, 
		followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
		
		We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input,
		and in any order), that explicitly counts the number of visits to each subdomain.
		
		Example 1:
		Input: 
		["9001 discuss.leetcode.com"]
		Output: 
		["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
		Explanation: 
		We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited.
		So they will all be visited 9001 times.

	 */
	public static void main(String[] args) {

		String [] cpdomains = {"9001 discuss.leetcode.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		List <String> result  = subdomainVisits(cpdomains);
		System.out.println(result.toString());
	}

	public static List<String> subdomainVisits(String[] cpdomains) {

        List<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>(); // key: subdomain, value: frequency
        StringBuilder resultStringBuilder = new StringBuilder();

        for (String cpdomain : cpdomains) {
            int indexSpace = cpdomain.indexOf(' ');
            int numClicks = Integer.parseInt(cpdomain.substring(0, indexSpace));
            String domain = cpdomain.substring(indexSpace + 1);
            resultStringBuilder.setLength(0);
            resultStringBuilder.append(domain);
            while (true) {
                map.put(resultStringBuilder.toString(), map.getOrDefault(resultStringBuilder.toString(), 0) + numClicks);
                int dotPosition = resultStringBuilder.indexOf(".");
                if (dotPosition == -1)
                    break;
                resultStringBuilder.delete(0, dotPosition + 1);
            }
        }

        for (String domain : map.keySet())
            result.add(map.get(domain) + " " + domain);

        return result;
    }

}
