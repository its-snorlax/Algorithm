package Advent;

import java.util.HashMap;
import java.util.Map;

public class PassportProcessing {
    public static void main(String[] args) {
        String input = "byr:1937\n" +
                "eyr:2030 pid:154364481\n" +
                "hgt:158cm iyr:2015 ecl:brn hcl:#c0946f cid:155\n" +
                "\n" +
                "cid:279\n" +
                "eyr:2029\n" +
                "pid:675014709 ecl:amb\n" +
                "byr:1985 hgt:179in hcl:z iyr:2025\n" +
                "\n" +
                "iyr:2011 hgt:181cm hcl:#341e13 pid:282499883 byr:1953\n" +
                "eyr:2023\n" +
                "ecl:brn\n" +
                "\n" +
                "eyr:2040 iyr:1984 pid:2371396209 byr:1951 cid:283 hgt:164cm\n" +
                "hcl:#623a2f\n" +
                "\n" +
                "iyr:2014 byr:1966 hgt:153cm pid:900693718 eyr:2020 ecl:gry hcl:#866857\n" +
                "\n" +
                "eyr:2020 hgt:162cm\n" +
                "byr:1939 pid:900852891 iyr:2020\n" +
                "ecl:oth hcl:#b6652a\n" +
                "\n" +
                "iyr:1956\n" +
                "hcl:2385ac\n" +
                "hgt:167in\n" +
                "ecl:#9b82e8\n" +
                "eyr:2003\n" +
                "cid:214 byr:2012 pid:483285062\n" +
                "\n" +
                "cid:146 byr:1938 hcl:#c0946f pid:136823471\n" +
                "hgt:180cm iyr:2011\n" +
                "eyr:2020 ecl:gry\n" +
                "\n" +
                "cid:100 hgt:187cm\n" +
                "byr:1973 ecl:blu\n" +
                "iyr:2020\n" +
                "hcl:#888785 eyr:2030\n" +
                "pid:386799181\n" +
                "\n" +
                "ecl:#dbba4f\n" +
                "hcl:z iyr:2028 pid:193cm\n" +
                "byr:2029\n" +
                "eyr:1962 hgt:113\n" +
                "\n" +
                "cid:269 byr:1928 pid:604152679\n" +
                "iyr:2017 eyr:2027\n" +
                "hcl:#c0946f\n" +
                "hgt:189cm\n" +
                "ecl:blu\n" +
                "\n" +
                "pid:653548437 hcl:z cid:166 iyr:2011 eyr:1967\n" +
                "hgt:162 ecl:xry byr:2019\n" +
                "\n" +
                "byr:1979 ecl:hzl iyr:2018 hcl:#7d3b0c\n" +
                "eyr:2026\n" +
                "pid:981366150 hgt:151cm\n" +
                "\n" +
                "pid:055334062 cid:272 eyr:2025 ecl:grn iyr:2016 hgt:159cm hcl:#a97842 byr:1989\n" +
                "\n" +
                "eyr:2033\n" +
                "hgt:170cm ecl:brn pid:#299cf2 hcl:#602927 byr:2004 iyr:2023\n" +
                "\n" +
                "iyr:2020 cid:273\n" +
                "pid:038972962\n" +
                "hcl:#c0946f hgt:152cm\n" +
                "eyr:2021 ecl:blu byr:1986\n" +
                "\n" +
                "pid:015622106 hgt:154cm iyr:2012 byr:1922\n" +
                "eyr:2028 hcl:#9dc667 ecl:blu\n" +
                "\n" +
                "iyr:2017 eyr:2025 hgt:179cm cid:324\n" +
                "pid:579870519 byr:1934\n" +
                "\n" +
                "hcl:#6b5442 eyr:2021\n" +
                "pid:104071480 ecl:brn\n" +
                "hgt:162cm cid:89 byr:1949\n" +
                "iyr:2017\n" +
                "\n" +
                "pid:388871409 cid:163 hgt:190cm ecl:amb eyr:2022 iyr:2019 byr:1963 hcl:#fffffd\n" +
                "\n" +
                "cid:190 byr:1968 iyr:2018\n" +
                "hgt:155cm hcl:#6b5442 ecl:grn\n" +
                "pid:891458997 eyr:2030\n" +
                "\n" +
                "hcl:z\n" +
                "cid:103 iyr:2026 hgt:171 byr:1979\n" +
                "pid:076174078\n" +
                "eyr:2031 ecl:#fc4638\n" +
                "\n" +
                "hcl:#f8063e pid:684921958 ecl:gry eyr:2020 iyr:2011\n" +
                "byr:1958 hgt:189cm\n" +
                "cid:131\n" +
                "\n" +
                "ecl:gry cid:90 iyr:2010 hgt:165cm\n" +
                "pid:683095019 byr:1953\n" +
                "hcl:#341e13\n" +
                "eyr:2030\n" +
                "\n" +
                "pid:000303662\n" +
                "ecl:amb iyr:2014 hcl:#733820 byr:1964 hgt:184cm cid:149\n" +
                "eyr:2027\n" +
                "\n" +
                "hcl:#341e13 hgt:150cm byr:1999 eyr:2022 pid:950260967 cid:72\n" +
                "ecl:grn iyr:2012\n" +
                "\n" +
                "cid:159 byr:1987\n" +
                "hcl:#623a2f pid:144877169 eyr:2021 ecl:brn hgt:164cm\n" +
                "\n" +
                "pid:759578668\n" +
                "cid:235 ecl:amb hgt:154cm\n" +
                "eyr:2023 byr:1941 hcl:#fffffd\n" +
                "iyr:2023\n" +
                "\n" +
                "pid:18101245 hcl:z hgt:172in iyr:1947 byr:1956 ecl:grn eyr:1964\n" +
                "\n" +
                "eyr:1980 pid:#8d62b1 ecl:#3e8868 cid:235\n" +
                "iyr:1978 hcl:#efcc98\n" +
                "byr:2025 hgt:181in\n" +
                "\n" +
                "hgt:64cm hcl:3bc533 iyr:2019 byr:2015 pid:158cm eyr:2027 ecl:#1abbd7\n" +
                "\n" +
                "eyr:2020 iyr:2011\n" +
                "pid:739854643 byr:1941 hgt:179cm hcl:#602927 ecl:gry cid:330\n" +
                "\n" +
                "hcl:#a97842 iyr:2011 hgt:167cm pid:527353688 byr:1927 cid:256 eyr:2026 ecl:grn\n" +
                "\n" +
                "iyr:2011 pid:350783151 hgt:168cm\n" +
                "byr:1961 ecl:amb hcl:#341e13\n" +
                "cid:181\n" +
                "\n" +
                "eyr:2025 hgt:160cm\n" +
                "ecl:brn hcl:#cfa07d pid:136929481\n" +
                "iyr:2017\n" +
                "\n" +
                "ecl:oth byr:1994 iyr:2020 hgt:162cm pid:578918570 eyr:2027 hcl:#fffffd\n" +
                "cid:325\n" +
                "\n" +
                "hgt:63in byr:1925\n" +
                "ecl:amb iyr:2014 cid:224\n" +
                "hcl:#341e13 pid:208286938\n" +
                "\n" +
                "ecl:#76434f hgt:97\n" +
                "hcl:z eyr:1968 pid:#871dc8 iyr:1955\n" +
                "byr:2007\n" +
                "\n" +
                "byr:2011\n" +
                "eyr:1962 hcl:9ac7b8 pid:6836105558\n" +
                "ecl:#d7084f\n" +
                "iyr:2023 hgt:76cm\n" +
                "\n" +
                "eyr:2016 iyr:2030 hgt:107 pid:948192703 byr:2013\n" +
                "hcl:b80af7 ecl:#d47439\n" +
                "\n" +
                "eyr:2027 iyr:2017\n" +
                "pid:#27d2a6 byr:1921 ecl:brn hcl:#c0946f hgt:59in\n" +
                "\n" +
                "byr:1982 hcl:#ceb3a1 ecl:brn eyr:2020 hgt:63in\n" +
                "iyr:2017\n" +
                "\n" +
                "ecl:brn hgt:152cm byr:1962\n" +
                "iyr:2013\n" +
                "pid:381950515 hcl:#2afabd eyr:2020\n" +
                "\n" +
                "hgt:158cm ecl:gry pid:252068098\n" +
                "cid:281 eyr:2023 byr:1950 iyr:2016\n" +
                "hcl:#ceb3a1\n" +
                "\n" +
                "byr:1922\n" +
                "hgt:187cm cid:74\n" +
                "hcl:#a97842\n" +
                "ecl:amb\n" +
                "pid:045338811\n" +
                "eyr:2025 iyr:2019\n" +
                "\n" +
                "hgt:176cm eyr:2022 iyr:2019 byr:1938 ecl:blu pid:610286298\n" +
                "hcl:#a97842\n" +
                "\n" +
                "iyr:2028 byr:2025\n" +
                "eyr:2039 pid:72530856 ecl:#a819ad hgt:69 hcl:z\n" +
                "\n" +
                "iyr:2018 eyr:2030\n" +
                "hcl:#8b1e1f ecl:hzl byr:1971\n" +
                "pid:189005628\n" +
                "\n" +
                "pid:531154383 eyr:2020 hcl:#733820 ecl:oth\n" +
                "hgt:72in\n" +
                "iyr:2016\n" +
                "byr:1983\n" +
                "\n" +
                "hgt:178cm hcl:#623a2f pid:562756202\n" +
                "eyr:2020\n" +
                "byr:1929 ecl:oth\n" +
                "iyr:2013\n" +
                "\n" +
                "iyr:2013 byr:1983 pid:510998389 ecl:gry\n" +
                "cid:99 hcl:#a97842\n" +
                "\n" +
                "ecl:gry eyr:2026\n" +
                "cid:202 hgt:191cm byr:1981\n" +
                "pid:414853225\n" +
                "hcl:#7d3b0c\n" +
                "\n" +
                "hcl:#866857 byr:1951 eyr:2020 hgt:169cm pid:844496997\n" +
                "iyr:2016 ecl:brn\n" +
                "\n" +
                "pid:083641628 iyr:2019 eyr:2030\n" +
                "byr:1938 ecl:hzl hcl:#b6652a hgt:68in\n" +
                "\n" +
                "hcl:#18171d\n" +
                "byr:1981\n" +
                "pid:425911593 cid:309 eyr:2026 ecl:brn hgt:168cm\n" +
                "\n" +
                "hcl:c84fda pid:#80d5e6 byr:1925 hgt:162cm iyr:2026\n" +
                "eyr:2036 ecl:#62c166\n" +
                "\n" +
                "pid:461660733 eyr:2028\n" +
                "hgt:167cm ecl:hzl hcl:#cfa07d iyr:2010\n" +
                "cid:183\n" +
                "\n" +
                "eyr:1930 byr:2021 iyr:2016 pid:163cm\n" +
                "hcl:79428f cid:136\n" +
                "ecl:amb\n" +
                "\n" +
                "hcl:#efcc98 hgt:176cm eyr:2022 ecl:brn iyr:2013 pid:541033681 byr:1952\n" +
                "\n" +
                "hgt:59cm\n" +
                "ecl:#d9b0bc pid:#3ab4b4 hcl:7aa29f\n" +
                "eyr:2034\n" +
                "byr:2011 cid:266 iyr:2004\n" +
                "\n" +
                "byr:1991 hcl:#cfa07d cid:259 hgt:67cm eyr:2024 pid:631601343 ecl:brn iyr:2011\n" +
                "\n" +
                "byr:2020\n" +
                "ecl:gry iyr:1944\n" +
                "pid:421649652 hgt:107\n" +
                "hcl:6d8593 eyr:2026\n" +
                "\n" +
                "ecl:blu\n" +
                "byr:1953 hgt:66in hcl:#888785 eyr:2021 pid:174284708\n" +
                "\n" +
                "ecl:#8f2c20\n" +
                "pid:27713962 iyr:2010 cid:149 byr:1952 hcl:#866857 eyr:2030\n" +
                "hgt:186cm\n" +
                "\n" +
                "eyr:2023 byr:1989 ecl:blu\n" +
                "hcl:#18171d pid:480641 iyr:2020\n" +
                "hgt:74in\n" +
                "\n" +
                "hcl:#efcc98\n" +
                "eyr:2023 hgt:157cm byr:1968\n" +
                "iyr:2013\n" +
                "ecl:amb pid:436599087\n" +
                "\n" +
                "eyr:2021\n" +
                "hgt:175cm hcl:#efcc98 ecl:hzl pid:701245439\n" +
                "byr:1943 iyr:2015\n" +
                "\n" +
                "hgt:164cm pid:310546869\n" +
                "eyr:2021 hcl:#b6652a ecl:oth iyr:2011 cid:181\n" +
                "byr:2001\n" +
                "\n" +
                "byr:2016 hcl:94f4b9 eyr:1922 hgt:155cm ecl:hzl iyr:2009 pid:83440078\n" +
                "\n" +
                "iyr:2014 hgt:60in\n" +
                "eyr:2031\n" +
                "hcl:#c0946f\n" +
                "byr:1948 ecl:grt pid:117909137\n" +
                "\n" +
                "byr:1965 hgt:186cm iyr:2010 cid:117 hcl:#602927 pid:806868279\n" +
                "eyr:2029\n" +
                "ecl:grn\n" +
                "\n" +
                "ecl:amb hgt:187cm hcl:#c0946f byr:1935\n" +
                "cid:139 iyr:2019 eyr:2023\n" +
                "\n" +
                "pid:925865182\n" +
                "byr:1952 hgt:158cm hcl:#619e03 ecl:gry eyr:2026\n" +
                "iyr:2016\n" +
                "\n" +
                "iyr:2012 hgt:73in\n" +
                "cid:199\n" +
                "byr:1959\n" +
                "ecl:hzl hcl:#fcd2f7 pid:268810283\n" +
                "\n" +
                "eyr:2025\n" +
                "pid:317239854 ecl:brn byr:1955 hcl:#fffffd cid:220 hgt:175cm\n" +
                "iyr:2015\n" +
                "\n" +
                "ecl:blu\n" +
                "byr:1939 hcl:#3332c0\n" +
                "iyr:2019 pid:832588457 eyr:2030 hgt:192cm\n" +
                "\n" +
                "hgt:64cm cid:326 ecl:oth byr:2025 eyr:2025 hcl:z iyr:2012 pid:0394683801\n" +
                "\n" +
                "ecl:amb byr:1966\n" +
                "pid:734257450 hgt:65in hcl:#fffffd iyr:2018 eyr:2025\n" +
                "cid:287\n" +
                "\n" +
                "cid:249\n" +
                "eyr:2034 ecl:#7b7bf5 byr:2009 pid:171cm hcl:709fe4\n" +
                "\n" +
                "hcl:d7c488 ecl:#b9bbb2\n" +
                "pid:55277333\n" +
                "cid:90 byr:2022 iyr:1978\n" +
                "hgt:69cm eyr:1981\n" +
                "\n" +
                "hcl:z\n" +
                "byr:1949 pid:057966198 eyr:1941\n" +
                "iyr:2025\n" +
                "\n" +
                "hgt:168cm ecl:hzl hcl:#866857 iyr:2011 pid:052204052 eyr:2030\n" +
                "byr:1970\n" +
                "\n" +
                "pid:318707043 eyr:2029 ecl:hzl hcl:#888785\n" +
                "byr:1932 iyr:2010\n" +
                "hgt:166cm\n" +
                "\n" +
                "hcl:z iyr:2010 ecl:oth byr:2006 cid:120 pid:#15d5ef eyr:2039 hgt:73cm\n" +
                "\n" +
                "hcl:96c534 hgt:193in eyr:2036 byr:2008 ecl:#090691 cid:109 pid:603339169 iyr:2027\n" +
                "\n" +
                "iyr:2029\n" +
                "ecl:utc\n" +
                "pid:5845500732 hcl:2a32b8\n" +
                "byr:2009 eyr:2040\n" +
                "cid:305 hgt:71cm\n" +
                "\n" +
                "byr:1994 iyr:2015\n" +
                "eyr:2026\n" +
                "hcl:#623a2f pid:678627790\n" +
                "hgt:176cm ecl:blu\n" +
                "\n" +
                "byr:2005 hcl:z\n" +
                "ecl:zzz pid:#47729a eyr:2039 hgt:62cm iyr:1983\n" +
                "\n" +
                "hcl:#cfa07d ecl:blu\n" +
                "iyr:2014 eyr:2025 pid:824483836 hgt:174cm byr:1933\n" +
                "\n" +
                "hgt:70in\n" +
                "iyr:2010 cid:53 eyr:2023 pid:093704222 ecl:amb hcl:#a97842 byr:1945\n" +
                "\n" +
                "ecl:brn hcl:#602927 byr:1986 eyr:2029\n" +
                "pid:422160398\n" +
                "cid:134\n" +
                "hgt:156cm\n" +
                "iyr:2020\n" +
                "\n" +
                "iyr:2014 hgt:187cm byr:1921 eyr:2022 ecl:amb\n" +
                "\n" +
                "pid:765750572 eyr:2021\n" +
                "ecl:hzl\n" +
                "iyr:1997 hgt:66\n" +
                "\n" +
                "iyr:2016\n" +
                "ecl:blu\n" +
                "cid:335\n" +
                "hgt:175cm pid:297297703 hcl:#b6652a\n" +
                "eyr:2030\n" +
                "\n" +
                "hgt:64in hcl:#866857 pid:159cm byr:1972\n" +
                "cid:321 eyr:2021 ecl:brn\n" +
                "iyr:2017\n" +
                "\n" +
                "pid:884038003\n" +
                "iyr:2016 hgt:188cm ecl:grn\n" +
                "byr:1928 eyr:2027 hcl:#341e13\n" +
                "\n" +
                "pid:020315021 hgt:60in ecl:amb iyr:2018\n" +
                "hcl:#602927\n" +
                "eyr:2028\n" +
                "byr:1935\n" +
                "\n" +
                "byr:1946 eyr:2021 hcl:#efcc98 iyr:2015\n" +
                "cid:52\n" +
                "hgt:177cm\n" +
                "pid:841348804\n" +
                "\n" +
                "ecl:gry eyr:2027\n" +
                "byr:1959 pid:482204272\n" +
                "hcl:#888785\n" +
                "iyr:2013\n" +
                "\n" +
                "hcl:#623a2f\n" +
                "eyr:2027 iyr:2011 hgt:189cm pid:767923916 ecl:hzl\n" +
                "byr:1987\n" +
                "\n" +
                "hgt:152in hcl:#efcc98 ecl:hzl eyr:2030 byr:1971 iyr:1978 pid:499148724\n" +
                "cid:194\n" +
                "\n" +
                "pid:#87513f hcl:e2a5de byr:2015 iyr:2016 hgt:155cm eyr:2024\n" +
                "ecl:gry cid:123\n" +
                "\n" +
                "byr:1977\n" +
                "iyr:2028\n" +
                "hcl:#888785 pid:69801913 eyr:2026 hgt:165in ecl:brn\n" +
                "\n" +
                "byr:1938 hcl:#efcc98 hgt:154cm pid:621714851 eyr:1972 ecl:gry iyr:2014 cid:161\n" +
                "\n" +
                "hcl:#a97842\n" +
                "hgt:184cm ecl:oth pid:009682326\n" +
                "cid:233 eyr:2023 iyr:2019 byr:1982\n" +
                "\n" +
                "hcl:#ceb3a1 pid:700761574 eyr:2020 byr:1940 iyr:2017\n" +
                "ecl:gry hgt:76in\n" +
                "\n" +
                "iyr:2017 cid:73\n" +
                "ecl:hzl\n" +
                "hcl:#efcc98 pid:363441284\n" +
                "hgt:177cm byr:1924 eyr:2028\n" +
                "\n" +
                "hcl:#a97842 eyr:2023 byr:1989 pid:589573553\n" +
                "ecl:oth\n" +
                "iyr:2017 hgt:162cm\n" +
                "\n" +
                "ecl:oth\n" +
                "byr:2001 hgt:167cm hcl:#18171d eyr:2028 iyr:2015 pid:253666913\n" +
                "\n" +
                "byr:1943 ecl:amb\n" +
                "hcl:#888785 pid:163cm iyr:2025 hgt:76 eyr:2026\n" +
                "\n" +
                "byr:1963 eyr:2030\n" +
                "hgt:158in iyr:2023 pid:399153486 hcl:#733820\n" +
                "\n" +
                "pid:43290252 hgt:167cm cid:302 iyr:2016 hcl:f81436\n" +
                "byr:1992 ecl:gry\n" +
                "eyr:1922\n" +
                "\n" +
                "pid:487300118 hgt:167cm hcl:#888785\n" +
                "iyr:2018 ecl:oth cid:286 byr:1971 eyr:2021\n" +
                "\n" +
                "eyr:2036\n" +
                "hgt:94\n" +
                "byr:2013\n" +
                "cid:162 hcl:37408d pid:527721797 ecl:dne\n" +
                "iyr:2022\n" +
                "\n" +
                "hcl:5e67df byr:1973 pid:48217944 hgt:65in eyr:2023\n" +
                "iyr:2001 ecl:gry\n" +
                "\n" +
                "hcl:717ef8 eyr:1996 pid:154cm ecl:#e2c90e\n" +
                "iyr:2028\n" +
                "byr:2009 hgt:184cm\n" +
                "\n" +
                "iyr:2015 pid:549968053 hcl:#efcc98\n" +
                "hgt:151cm eyr:2025\n" +
                "byr:1993\n" +
                "ecl:gry\n" +
                "\n" +
                "hgt:165cm ecl:gry\n" +
                "iyr:2020\n" +
                "byr:1927 hcl:#602927 pid:278946330\n" +
                "eyr:2027\n" +
                "\n" +
                "eyr:2031\n" +
                "ecl:#b01aae pid:151cm\n" +
                "cid:188 iyr:2025\n" +
                "hgt:60cm byr:2015\n" +
                "\n" +
                "eyr:2028 pid:928740840\n" +
                "byr:1931\n" +
                "hgt:191cm iyr:2014 cid:305\n" +
                "hcl:#6b5442\n" +
                "ecl:oth\n" +
                "\n" +
                "hcl:#7d3b0c cid:283 byr:1923 ecl:amb\n" +
                "pid:781290431 iyr:2019\n" +
                "eyr:2021\n" +
                "hgt:191cm\n" +
                "\n" +
                "byr:2027\n" +
                "pid:51702036\n" +
                "iyr:2028 hgt:165in ecl:gry hcl:z\n" +
                "eyr:2036\n" +
                "\n" +
                "byr:1971\n" +
                "ecl:blu iyr:2012 pid:986042111\n" +
                "eyr:2021 hcl:#888785\n" +
                "hgt:68in\n" +
                "\n" +
                "hgt:183cm byr:2030\n" +
                "iyr:2013\n" +
                "cid:209 pid:989002507\n" +
                "ecl:hzl eyr:2028 hcl:59c2ce\n" +
                "\n" +
                "ecl:gry iyr:2020 pid:895856989 hcl:#888785\n" +
                "hgt:185cm byr:1964 eyr:2025\n" +
                "\n" +
                "ecl:gry\n" +
                "hgt:183cm cid:97 hcl:#93be9b eyr:2021\n" +
                "byr:1995 pid:668647173\n" +
                "\n" +
                "hcl:#733820 eyr:2027\n" +
                "byr:1977 pid:242773849 hgt:184cm iyr:2017\n" +
                "cid:76 ecl:brn\n" +
                "\n" +
                "hgt:167 hcl:z byr:2012 eyr:2027\n" +
                "pid:590438786 ecl:hzl\n" +
                "cid:101 iyr:1994\n" +
                "\n" +
                "iyr:2015\n" +
                "hcl:#888785 eyr:2024\n" +
                "ecl:blu pid:279218875 cid:178 byr:1944 hgt:74in\n" +
                "\n" +
                "ecl:oth cid:334 pid:169599381\n" +
                "hcl:#7d3b0c eyr:2028 hgt:172cm iyr:2010\n" +
                "\n" +
                "eyr:2033 byr:1973 cid:333 iyr:2019 hcl:z ecl:utc\n" +
                "hgt:178cm pid:#e7abc0\n" +
                "\n" +
                "eyr:2026 ecl:blu cid:264 byr:1998 hgt:177cm hcl:#602927\n" +
                "pid:770052780\n" +
                "iyr:2019\n" +
                "\n" +
                "ecl:blu\n" +
                "iyr:2016 cid:232 eyr:2023\n" +
                "pid:643597545 hgt:167cm byr:1986 hcl:#cfa07d\n" +
                "\n" +
                "pid:017818204\n" +
                "iyr:2017 eyr:2028 hgt:168cm hcl:#602927 byr:1931 ecl:oth\n" +
                "\n" +
                "byr:1984 ecl:grn hgt:191cm hcl:#efcc98 pid:408382086\n" +
                "iyr:2010 eyr:2025\n" +
                "\n" +
                "hgt:158cm ecl:#25e195 byr:1929 pid:0367744553 eyr:1957 iyr:2017\n" +
                "hcl:z\n" +
                "\n" +
                "hgt:168cm byr:1977 pid:006609828\n" +
                "eyr:2024\n" +
                "iyr:2015\n" +
                "ecl:amb hcl:#b6652a\n" +
                "\n" +
                "pid:635167847 iyr:2010 hcl:#18171d hgt:163cm ecl:grn\n" +
                "eyr:2026\n" +
                "\n" +
                "pid:423029177 byr:1995\n" +
                "iyr:2014 ecl:hzl\n" +
                "hgt:185cm hcl:#c0946f eyr:2024 cid:230\n" +
                "\n" +
                "pid:#3e3109 ecl:#a8a0aa iyr:2020 hcl:#733820 eyr:2021 byr:2010 hgt:179in\n" +
                "\n" +
                "iyr:2017 byr:1938 eyr:2022 hcl:#733820 ecl:amb hgt:157cm pid:162425330\n" +
                "\n" +
                "hgt:160cm\n" +
                "cid:339 byr:1938\n" +
                "hcl:#341e13\n" +
                "eyr:2025 iyr:2015\n" +
                "pid:562755634\n" +
                "\n" +
                "cid:283 byr:1954 ecl:blu hcl:#ceb3a1 hgt:169cm iyr:2013 pid:616439723\n" +
                "\n" +
                "pid:830940520 eyr:2022\n" +
                "byr:1981 hgt:193cm hcl:#18171d iyr:2013\n" +
                "cid:117\n" +
                "\n" +
                "hcl:#866857 iyr:2019 ecl:hzl byr:1962 hgt:72in eyr:2020\n" +
                "\n" +
                "byr:2015 pid:4530685490 ecl:#c7604e hcl:z\n" +
                "hgt:151 eyr:1972 iyr:1948\n" +
                "\n" +
                "pid:0800674852 hcl:z\n" +
                "ecl:#2a275e hgt:61cm\n" +
                "iyr:1950 eyr:1938\n" +
                "\n" +
                "iyr:2028\n" +
                "eyr:1998\n" +
                "pid:#c604ca\n" +
                "hgt:122 hcl:z\n" +
                "ecl:dne cid:160 byr:2018\n" +
                "\n" +
                "hcl:z\n" +
                "cid:67 iyr:2029\n" +
                "byr:1973\n" +
                "ecl:amb eyr:2030\n" +
                "hgt:66\n" +
                "\n" +
                "ecl:hzl\n" +
                "pid:483557353 eyr:2021\n" +
                "hgt:172cm iyr:2011\n" +
                "hcl:#888785\n" +
                "byr:1963\n" +
                "\n" +
                "eyr:2030 ecl:brn hcl:#fffffd byr:1969\n" +
                "hgt:161cm pid:632930895\n" +
                "iyr:2017\n" +
                "\n" +
                "iyr:2015 byr:2000\n" +
                "pid:525557240 hgt:156cm eyr:2029\n" +
                "ecl:brn hcl:#64bf85\n" +
                "\n" +
                "byr:2007\n" +
                "iyr:2012 eyr:2029 ecl:#7c1d6f pid:612320497 hgt:165in\n" +
                "\n" +
                "eyr:2026 ecl:grn cid:93\n" +
                "hcl:#888785 hgt:134 pid:745552484 iyr:2019 byr:1999\n" +
                "\n" +
                "byr:2001 pid:984678649 hgt:173cm ecl:oth iyr:2012 cid:345 hcl:#fffffd\n" +
                "eyr:2028\n" +
                "\n" +
                "hcl:#341e13 pid:308853935\n" +
                "byr:1972 hgt:160cm iyr:2012 eyr:2026\n" +
                "ecl:amb cid:97\n" +
                "\n" +
                "hcl:z hgt:151\n" +
                "ecl:grn pid:132866718\n" +
                "iyr:2021 byr:1932\n" +
                "eyr:2024\n" +
                "\n" +
                "eyr:2027 byr:1923\n" +
                "ecl:oth hgt:174cm hcl:#733820\n" +
                "pid:099185839\n" +
                "iyr:2017\n" +
                "\n" +
                "iyr:2017 ecl:gry byr:1941\n" +
                "hgt:74in\n" +
                "pid:540930352\n" +
                "hcl:#888785 eyr:2023\n" +
                "\n" +
                "hgt:161cm cid:277\n" +
                "hcl:#866857\n" +
                "byr:1928\n" +
                "eyr:2030 ecl:blu\n" +
                "iyr:2020 pid:358953579\n" +
                "\n" +
                "hgt:155cm eyr:1930\n" +
                "iyr:2015 ecl:utc\n" +
                "pid:163cm\n" +
                "byr:2008 hcl:#733820 cid:156\n" +
                "\n" +
                "byr:1946 hgt:164cm\n" +
                "cid:234 iyr:2015\n" +
                "pid:168804387 eyr:2025\n" +
                "ecl:hzl hcl:#a97842\n" +
                "\n" +
                "hgt:184cm\n" +
                "hcl:#7d3b0c byr:1996 cid:193 iyr:2011 ecl:amb eyr:2030 pid:940497049\n" +
                "\n" +
                "hcl:#733820 iyr:2016 hgt:168\n" +
                "eyr:2020\n" +
                "cid:118 pid:9871436 ecl:gry\n" +
                "\n" +
                "pid:416683862\n" +
                "hgt:162in\n" +
                "hcl:#602927 byr:2027\n" +
                "eyr:2027 ecl:gmt\n" +
                "\n" +
                "ecl:#771e11\n" +
                "iyr:2024\n" +
                "cid:81 pid:741843390\n" +
                "hcl:#866857 byr:2012 eyr:1964\n" +
                "hgt:157in\n" +
                "\n" +
                "pid:720946735\n" +
                "byr:2002 hcl:#18171d iyr:2026 hgt:70cm\n" +
                "ecl:brn eyr:2025\n" +
                "\n" +
                "byr:1987 hcl:#623a2f\n" +
                "hgt:165cm pid:087526326 ecl:grn\n" +
                "iyr:2017 eyr:2021\n" +
                "\n" +
                "byr:2014 hgt:193cm\n" +
                "iyr:2018 hcl:z\n" +
                "eyr:2027 pid:792398819\n" +
                "\n" +
                "cid:233\n" +
                "hcl:z ecl:#18002d hgt:174cm iyr:2027 eyr:1944\n" +
                "\n" +
                "pid:142615460 ecl:blu eyr:2021\n" +
                "hcl:#c88693 iyr:2017 cid:182 hgt:152cm byr:1966\n" +
                "\n" +
                "hcl:z hgt:65cm\n" +
                "eyr:1944 ecl:dne byr:2029 pid:1066768764\n" +
                "iyr:2015\n" +
                "cid:149\n" +
                "\n" +
                "hcl:z pid:25144284 hgt:152in\n" +
                "byr:2009\n" +
                "cid:276 eyr:2037\n" +
                "iyr:2010 ecl:gmt\n" +
                "\n" +
                "cid:88 hcl:ed6b8a ecl:xry hgt:178in pid:36832491 byr:2020 iyr:2012 eyr:1993\n" +
                "\n" +
                "byr:1972 iyr:2009 pid:324213657 hgt:160 hcl:z cid:259 eyr:2021 ecl:grn\n" +
                "\n" +
                "hcl:#7d3b0c pid:164496070 eyr:2024 ecl:brn hgt:165cm\n" +
                "\n" +
                "pid:955035528\n" +
                "byr:1967 eyr:2021 iyr:2015 hcl:#fffffd hgt:156cm\n" +
                "cid:237\n" +
                "ecl:blu\n" +
                "\n" +
                "hcl:z\n" +
                "eyr:2038 iyr:1973 ecl:grt hgt:193in\n" +
                "pid:41385449 byr:2011\n" +
                "cid:119\n" +
                "\n" +
                "byr:1934 pid:713339056 hgt:157cm cid:250 iyr:2016 ecl:blu hcl:#866857 eyr:2026\n" +
                "\n" +
                "hgt:186cm byr:2012\n" +
                "eyr:2022\n" +
                "iyr:2013 hcl:#733820 pid:226693031 ecl:hzl\n" +
                "\n" +
                "cid:118 pid:56750275 hcl:#cfa07d iyr:2028 eyr:2033 byr:1933 hgt:166cm\n" +
                "\n" +
                "byr:1973\n" +
                "ecl:hzl hgt:167 hcl:z\n" +
                "iyr:2015 pid:70648423\n" +
                "\n" +
                "byr:1929\n" +
                "iyr:2012 pid:083005744 ecl:brn hgt:162cm\n" +
                "eyr:2024\n" +
                "hcl:#cfa07d\n" +
                "\n" +
                "hcl:#623a2f hgt:174cm\n" +
                "eyr:2026 iyr:2020\n" +
                "ecl:grn\n" +
                "byr:1981\n" +
                "\n" +
                "cid:236 byr:1979 iyr:2013 ecl:amb eyr:2030 hcl:#6b5442 pid:768869830\n" +
                "\n" +
                "hcl:#341e13 byr:1998 iyr:2020\n" +
                "pid:857980686\n" +
                "ecl:hzl hgt:175cm eyr:2028\n" +
                "\n" +
                "hgt:169in\n" +
                "cid:305 eyr:2023\n" +
                "ecl:gry pid:833031763 hcl:#ceb3a1 iyr:2015 byr:1974\n" +
                "\n" +
                "pid:370671195 hgt:162cm\n" +
                "iyr:2018 ecl:oth byr:2001 hcl:#7d3b0c\n" +
                "eyr:2021\n" +
                "\n" +
                "eyr:2026\n" +
                "ecl:brn\n" +
                "cid:288\n" +
                "hcl:#866857 iyr:2010 byr:1922\n" +
                "pid:309109383\n" +
                "\n" +
                "byr:1949 iyr:2015 pid:832774982 eyr:2029\n" +
                "hgt:182cm\n" +
                "hcl:#b7144c ecl:amb\n" +
                "\n" +
                "eyr:2029 iyr:2020\n" +
                "hcl:#c0946f\n" +
                "pid:953788134\n" +
                "byr:1954 hgt:167cm\n" +
                "\n" +
                "pid:981508704 eyr:2023 iyr:2013 hgt:66in cid:68 hcl:#fffffd byr:1996 ecl:oth\n" +
                "\n" +
                "iyr:2011 byr:1932 cid:232 eyr:2030\n" +
                "hcl:#c0946f\n" +
                "hgt:169cm pid:994763987\n" +
                "ecl:hzl\n" +
                "\n" +
                "ecl:gmt eyr:2031 hcl:z\n" +
                "byr:2006 cid:86 hgt:59cm iyr:1998 pid:#349a7f\n" +
                "\n" +
                "hcl:#7d3b0c iyr:2013 pid:549500594 eyr:2024 byr:1971 ecl:oth\n" +
                "hgt:153cm\n" +
                "\n" +
                "iyr:2015\n" +
                "byr:1940 pid:798926275 eyr:2027\n" +
                "hcl:#cfa07d\n" +
                "hgt:158cm ecl:amb\n" +
                "\n" +
                "ecl:brn pid:077141823\n" +
                "eyr:1945 iyr:2023 hcl:#602927 byr:1956\n" +
                "hgt:152\n" +
                "\n" +
                "iyr:2022\n" +
                "byr:2007\n" +
                "hcl:f87f81 pid:8404831740 eyr:2033 hgt:170cm\n" +
                "ecl:gmt\n" +
                "\n" +
                "iyr:1958\n" +
                "ecl:dne hcl:840fbe\n" +
                "cid:55 eyr:2032 pid:19403738 hgt:170cm\n" +
                "byr:2029\n" +
                "\n" +
                "ecl:brn pid:864743117\n" +
                "eyr:2025\n" +
                "hgt:188cm byr:1934 hcl:#623a2f\n" +
                "iyr:2011\n" +
                "\n" +
                "iyr:2010 pid:877675472 hcl:#7d3b0c eyr:2027 byr:1954 hgt:182cm\n" +
                "ecl:oth\n" +
                "\n" +
                "iyr:2015 hcl:#a97842 pid:719192774 ecl:brn\n" +
                "byr:1993\n" +
                "hgt:186cm\n" +
                "\n" +
                "eyr:2021 hgt:176cm pid:395161956 hcl:#602927\n" +
                "ecl:grn iyr:2020 byr:1972\n" +
                "\n" +
                "hcl:#fffffd hgt:167cm byr:1945 ecl:grn iyr:2017 eyr:2026\n" +
                "\n" +
                "hcl:#6b5442 ecl:gry cid:208 hgt:155cm iyr:2010 byr:1933 pid:040244553\n" +
                "eyr:2029\n" +
                "\n" +
                "iyr:1960 cid:281 ecl:#8f7c45 hcl:z pid:11609858 eyr:1955 hgt:150in\n" +
                "byr:1985\n" +
                "\n" +
                "hgt:150cm byr:2002 hcl:#fffffd\n" +
                "pid:337375886 iyr:2011 ecl:amb\n" +
                "eyr:2037\n" +
                "\n" +
                "iyr:2014 ecl:oth hgt:155cm hcl:#866857 eyr:2025 pid:614859979 cid:338\n" +
                "byr:1952\n" +
                "\n" +
                "hcl:#623a2f hgt:156cm\n" +
                "iyr:2010 ecl:amb byr:1997\n" +
                "cid:285\n" +
                "pid:225568504 eyr:2020\n" +
                "\n" +
                "iyr:2021 hcl:#ceb3a1 ecl:#d6db5a pid:185cm eyr:2020 cid:130 byr:2009\n" +
                "\n" +
                "byr:1956\n" +
                "cid:245 iyr:1954 ecl:dne hcl:#341e13 eyr:2040 hgt:71cm pid:838134394\n" +
                "\n" +
                "eyr:2027\n" +
                "byr:1994 ecl:amb iyr:2014 hgt:168cm\n" +
                "cid:278\n" +
                "hcl:#602927 pid:758176176\n" +
                "\n" +
                "hcl:#941519 ecl:gry eyr:2030 byr:1921\n" +
                "pid:9477831046\n" +
                "iyr:2018 hgt:189cm\n" +
                "\n" +
                "cid:339 hcl:#6b5442\n" +
                "byr:1972\n" +
                "ecl:oth\n" +
                "iyr:2014 hgt:183cm eyr:2020\n" +
                "\n" +
                "cid:165\n" +
                "eyr:1926 hcl:#6b5442 iyr:1956 hgt:65cm byr:2029\n" +
                "pid:9240052093 ecl:xry\n" +
                "\n" +
                "ecl:grn\n" +
                "eyr:2027\n" +
                "hcl:#fffffd byr:1975 iyr:2011 hgt:177cm pid:825090410 cid:121\n" +
                "\n" +
                "byr:1934\n" +
                "hcl:#733820 pid:133141914 eyr:2027\n" +
                "hgt:66in\n" +
                "ecl:amb\n" +
                "iyr:2010 cid:262\n" +
                "\n" +
                "iyr:1951\n" +
                "ecl:#bb9733 hcl:89fcbf\n" +
                "byr:2018 pid:#13265f hgt:85\n" +
                "eyr:1977\n" +
                "\n" +
                "hcl:#324bed ecl:hzl hgt:155cm\n" +
                "iyr:2013 byr:1942 eyr:2021\n" +
                "pid:758516520\n" +
                "\n" +
                "ecl:gry\n" +
                "pid:#567782 iyr:2015 hcl:276a6d eyr:2028\n" +
                "hgt:60cm\n" +
                "byr:2005\n" +
                "\n" +
                "hcl:#18171d hgt:191cm eyr:2030\n" +
                "ecl:grn pid:748729106 byr:1922 iyr:2017\n" +
                "\n" +
                "byr:1984 hcl:#733820 eyr:2020 iyr:2013 hgt:64in pid:444446114\n" +
                "ecl:hzl\n" +
                "\n" +
                "byr:2006 ecl:dne iyr:2029 hcl:z\n" +
                "eyr:2023 hgt:68cm\n" +
                "pid:131910019\n" +
                "\n" +
                "iyr:1976 hcl:45191a eyr:2017 hgt:68cm\n" +
                "ecl:oth pid:153cm byr:1968\n" +
                "\n" +
                "ecl:gry byr:1959 eyr:2023 pid:781945569\n" +
                "iyr:2015 hcl:#ceb3a1 hgt:167cm\n" +
                "\n" +
                "hgt:151cm\n" +
                "byr:1959 hcl:#7d3b0c\n" +
                "cid:76 pid:069205247 ecl:gry eyr:2029\n" +
                "iyr:2013\n" +
                "\n" +
                "pid:055193304\n" +
                "hcl:#fffffd\n" +
                "hgt:67in ecl:grn iyr:2011\n" +
                "\n" +
                "eyr:2026\n" +
                "byr:1975\n" +
                "pid:681437369\n" +
                "hgt:173cm hcl:#a97842\n" +
                "iyr:2017 ecl:brn\n" +
                "\n" +
                "pid:298214774 hgt:158cm ecl:hzl\n" +
                "hcl:#866857 byr:1993 iyr:2013\n" +
                "eyr:2028\n" +
                "\n" +
                "hcl:#b6652a eyr:2023 pid:879418046 hgt:193cm\n" +
                "iyr:2014\n" +
                "ecl:brn\n" +
                "\n" +
                "hgt:164cm\n" +
                "eyr:2028 hcl:fbd462 ecl:gry\n" +
                "iyr:2011 byr:1938 pid:029003659\n" +
                "\n" +
                "byr:1999 hgt:171cm eyr:2024 cid:195 pid:041799326 ecl:gry iyr:2012 hcl:#a97842\n" +
                "\n" +
                "byr:1963 pid:7471206322 iyr:2015 ecl:brn hcl:#623a2f hgt:72cm\n" +
                "cid:63\n" +
                "\n" +
                "byr:1961\n" +
                "ecl:hzl hcl:#efcc98\n" +
                "pid:617022365\n" +
                "eyr:2020 hgt:155cm iyr:2018\n" +
                "\n" +
                "pid:385763432 byr:1977 cid:228 hcl:#733820 eyr:2020\n" +
                "hgt:163cm ecl:grt\n" +
                "iyr:2015\n" +
                "\n" +
                "byr:1979 hgt:186in eyr:2037\n" +
                "ecl:dne\n" +
                "iyr:2025 hcl:d93e3e\n" +
                "pid:187cm\n" +
                "\n" +
                "iyr:2018\n" +
                "cid:158 eyr:2020\n" +
                "byr:1929\n" +
                "pid:334374178 hgt:181cm hcl:z ecl:grn\n" +
                "\n" +
                "cid:135 ecl:oth hcl:#623a2f\n" +
                "iyr:2017\n" +
                "eyr:2024 byr:1940\n" +
                "hgt:66in\n" +
                "\n" +
                "cid:92 eyr:2026 hcl:#888785 pid:827526879 byr:1990\n" +
                "hgt:186cm ecl:amb iyr:2014\n" +
                "\n" +
                "pid:575519103\n" +
                "iyr:2016 byr:1964 hcl:#7d3b0c cid:252 hgt:172cm\n" +
                "\n" +
                "hcl:#c0946f\n" +
                "ecl:grn hgt:75in\n" +
                "eyr:2021 pid:426544544\n" +
                "\n" +
                "cid:171 byr:2004\n" +
                "hcl:z\n" +
                "hgt:191cm eyr:2028 pid:#292b3b ecl:brn\n" +
                "\n" +
                "iyr:2016 ecl:hzl\n" +
                "byr:2007\n" +
                "hgt:167cm hcl:#653b4c cid:124 eyr:2022\n" +
                "pid:#27024c\n" +
                "\n" +
                "hgt:177cm byr:2025\n" +
                "hcl:z cid:303 iyr:2016 eyr:2000 ecl:dne\n" +
                "pid:345555418\n" +
                "\n" +
                "eyr:2040\n" +
                "hcl:70fbf6 cid:318\n" +
                "byr:2027 iyr:2022\n" +
                "ecl:#3a037c pid:644624005\n" +
                "hgt:62cm\n" +
                "\n" +
                "ecl:brn iyr:2016 hgt:150cm pid:680594195 cid:324 hcl:#602927\n" +
                "byr:1944\n" +
                "\n" +
                "hcl:z eyr:2022 byr:2020 cid:112 ecl:dne iyr:2029\n" +
                "pid:#3a3560 hgt:153in\n" +
                "\n" +
                "cid:86\n" +
                "ecl:gry byr:1972 hcl:#866857 pid:758976621 hgt:188cm\n" +
                "\n" +
                "pid:#850e8b eyr:2025 hgt:163in\n" +
                "ecl:#71e9e2\n" +
                "hcl:#623a2f\n" +
                "\n" +
                "ecl:amb byr:1958 hgt:193cm\n" +
                "pid:343803154 iyr:2010 eyr:2029 cid:86 hcl:#602927\n" +
                "\n" +
                "hgt:178cm byr:1987 ecl:blu hcl:#866857 iyr:2017\n" +
                "pid:222443921 eyr:2027\n" +
                "\n" +
                "byr:1964 iyr:2001\n" +
                "hgt:180cm eyr:1945\n" +
                "hcl:#fffffd pid:305189916 ecl:#ac3c49\n" +
                "cid:142\n" +
                "\n" +
                "byr:1979 hgt:166cm ecl:brn\n" +
                "cid:202 hcl:#5311ca eyr:2028 pid:874418818 iyr:2014\n" +
                "\n" +
                "hgt:161cm byr:1987 ecl:grn hcl:#6b5442 pid:986096798\n" +
                "cid:74\n" +
                "eyr:2027 iyr:2019\n" +
                "\n" +
                "byr:1964 iyr:1979 eyr:2022 ecl:#77ada3\n" +
                "hcl:#733820\n" +
                "cid:56\n" +
                "\n" +
                "hgt:185cm iyr:2010 pid:214991920 eyr:2023 cid:236 hcl:#866857 ecl:brn byr:1965\n" +
                "\n" +
                "pid:885169578 iyr:2010 byr:1948 ecl:hzl hcl:#18171d\n" +
                "eyr:2025 hgt:175cm\n" +
                "\n" +
                "ecl:oth pid:34655368\n" +
                "hgt:186\n" +
                "byr:1968\n" +
                "hcl:2653c9\n" +
                "eyr:2030 iyr:2024\n" +
                "\n" +
                "eyr:2022 iyr:2015 ecl:gry hgt:65in byr:1994\n" +
                "pid:766704860\n" +
                "\n" +
                "hcl:#c0946f cid:104 iyr:2015\n" +
                "pid:739274357\n" +
                "ecl:#ef45c8\n" +
                "byr:1960 hgt:61in eyr:2026\n" +
                "\n" +
                "pid:849044092 eyr:2020 hgt:186cm iyr:2014\n" +
                "byr:1991 hcl:#866857\n" +
                "\n" +
                "hgt:159cm iyr:1950\n" +
                "eyr:2021 pid:325442644 hcl:#888785\n" +
                "ecl:gry byr:1986\n" +
                "\n" +
                "eyr:2023 hgt:188cm\n" +
                "iyr:2014\n" +
                "pid:945115479 byr:1979 ecl:blu hcl:#b6652a\n" +
                "\n" +
                "eyr:2024\n" +
                "cid:274 pid:390115952 byr:1934 hgt:161cm iyr:2017 hcl:#b95b0d\n" +
                "\n" +
                "ecl:#a16ec8 pid:187cm hcl:z iyr:2029 hgt:170\n" +
                "byr:2008";
        String[] split = input.split("\n\n");
        int count = 0;
        for (String s : split) if (isValid(s)) count++;
        System.out.println(count);
    }

    private static Boolean isValid(String input) {
        HashMap<String, String> map = new HashMap<>();
        String[] split = input.split("\n");
        for (String s : split) {
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                String[] split1 = s2.split(":");
                map.put(split1[0], split1[1]);
            }
        }
        if (!map.containsKey("hcl") ||
                !map.containsKey("iyr") ||
                !map.containsKey("eyr") ||
                !map.containsKey("ecl") ||
                !map.containsKey("pid") ||
                !map.containsKey("byr") ||
                !map.containsKey("hgt")) return false;

        for (Map.Entry<String, String> set : map.entrySet()) {
            if (!validSet(set)) return false;
        }
        return true;
    }

    private static boolean validSet(Map.Entry<String, String> set) {
        String key = set.getKey();
        String value = set.getValue();
        switch (key) {
            case "byr":
                if (value.length() != 4) return false;
                int i = Integer.parseInt(value);
                return i >= 1920 && i <= 2002;
            case "iyr":
                if (value.length() != 4) return false;
                int j = Integer.parseInt(value);
                return j >= 2010 && j <= 2020;
            case "eyr":
                if (value.length() != 4) return false;
                int k = Integer.parseInt(value);
                return k >= 2020 && k <= 2030;
            case "hgt":
                if (value.length() >= 4) {
                    int num = Integer.parseInt(value.substring(0, value.length() - 2));
                    if (value.endsWith("cm")) {
                        return num >= 150 && num <= 193;
                    }
                    if (value.endsWith("in")) {
                        return num >= 59 && num <= 76;
                    }
                } else return false;
            case "hcl":
                return value.matches("^#([a-f0-9]{6})");
            case "ecl":
                return value.equals("amb") ||
                        value.equals("blu") ||
                        value.equals("brn") ||
                        value.equals("gry") ||
                        value.equals("grn") ||
                        value.equals("hzl") ||
                        value.equals("oth");
            case "pid":
                return value.length() == 9;
            case "cid":
                return true;
        }
        return false;
    }
}
