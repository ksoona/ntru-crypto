/******************************************************************************
 * NTRU Cryptography Reference Source Code
 * Copyright (c) 2009-2013, by Security Innovation, Inc. All rights reserved.
 *
 * Copyright (C) 2009-2013  Security Innovation
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *********************************************************************************/

package com.securityinnovation.jNeo;

import org.junit.Test;
import static org.junit.Assert.*;

public class OIDBBTestCase {

    /////////////////////////////////////////////////////////////////////////
    // Test valueOf
    // 
    // Implements test case OVO-1.
    public void test_valueOf_values()
    {
        assertEquals(OID.ees401ep1, OID.valueOf("ees401ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees449ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees677ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees1087ep2"));

        assertEquals(OID.ees401ep1, OID.valueOf("ees541ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees613ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees887ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees1171ep1"));

        assertEquals(OID.ees401ep1, OID.valueOf("ees659ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees761ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees1087ep1"));
        assertEquals(OID.ees401ep1, OID.valueOf("ees1499ep1"));
    }
    
    // Implements test case OVO-2.
    @Test(expected=NullPointerException.class)
    public void test_valueOf_null()
    {
        OID.valueOf(null);
    }
    
    // Implements test case OVO-3.
    @Test(expected=IllegalArgumentException.class)
    public void test_valueOf_invalid()
    {
        OID.valueOf("ees000ep12");
    }
    

    /////////////////////////////////////////////////////////////////////////
    // Test values
    //
    // Implements test case OVS-1.
    public void test_values_result()
    {
        OID values[] = OID.values();
        assertEquals(12, values.length);
        assertTrue(findOID(values, OID.ees401ep1));
        assertTrue(findOID(values, OID.ees449ep1));
        assertTrue(findOID(values, OID.ees677ep1));
        assertTrue(findOID(values, OID.ees1087ep2));
        assertTrue(findOID(values, OID.ees541ep1));
        assertTrue(findOID(values, OID.ees613ep1));
        assertTrue(findOID(values, OID.ees887ep1));
        assertTrue(findOID(values, OID.ees1171ep1));
        assertTrue(findOID(values, OID.ees659ep1));
        assertTrue(findOID(values, OID.ees761ep1));
        assertTrue(findOID(values, OID.ees1087ep1));
        assertTrue(findOID(values, OID.ees1499ep1));
    }
    boolean findOID(
        OID oidArray[],
        OID oid)
    {
        for (int i=0; i<oidArray.length; i++)
          if (oid == oidArray[i])
            return true;
        return false;
    }
}
