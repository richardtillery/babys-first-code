
package com.pst.test.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.0
 * Mon Jun 01 13:43:14 EDT 2015
 * Generated source version: 3.1.0
 */

@XmlRootElement(name = "fetchSpecificPersonMessageResponse", namespace = "http://service.test.pst.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchSpecificPersonMessageResponse", namespace = "http://service.test.pst.com/")

public class FetchSpecificPersonMessageResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

