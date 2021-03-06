/*@author Tushar Balarajan
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment


***** BEGIN LICENSE BLOCK *****
        Version: MPL 1.1/GPL 2.0/LGPL 2.1

        The contents of this file are subject to the Mozilla Public License Version
        1.1 (the "License"); you may not use this file except in compliance with
        the License. You may obtain a copy of the License at
        http://www.mozilla.org/MPL/

        Software distributed under the License is distributed on an "AS IS" basis,
        WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
        for the specific language governing rights and limitations under the
        License.

        The Initial Developer of the Original Code is
        Tushar Balarajan.
        Portions created by the Initial Developer are Copyright (C) 2017
        the Initial Developer. All Rights Reserved.

        Contributor(s):

        Alternatively, the contents of this file may be used under the terms of
        either the GNU General Public License Version 2 or later (the "GPL"), or
        the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
        in which case the provisions of the GPL or the LGPL are applicable instead
        of those above. If you wish to allow use of your version of this file only
        under the terms of either the GPL or the LGPL, and not to allow others to
        use your version of this file under the terms of the MPL, indicate your
        decision by deleting the provisions above and replace them with the notice
        and other provisions required by the GPL or the LGPL. If you do not delete
        the provisions above, a recipient may use your version of this file under
        the terms of any one of the MPL, the GPL or the LGPL.

        ***** END LICENSE BLOCK *****
*/

/**
 * <P>The purpose of this program is to calculate distances in feet and meters using 2 conversion methods and displaying them in a table</P>
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(
                "\nFeet     Meters     |     Meters     Feet\n" +
                        "----------------------------------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%4.1f     ", feet);
            System.out.printf("%6.3f", footToMeter(feet));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));
        }
    }

    /**
     *
     * @param foot takes in distance as feet
     * @return value as meter using simple calculation of 0.305 * feet
     */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /**
     *
     * @param meter takes in distance as meter
     * @return value as feet using calculation of 3.279 * meter
     */

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

}