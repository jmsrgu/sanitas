package com.mycorp.support;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ValueCode {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5798796727044118127L;

    /** The code. */
    private String code;

    /** The value. */
    private String value;

    /**
     * Gets the code.
     *
     * @return the code
     */
    public final String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code
     *            the new code
     */
    public final void setCode( String code ) {
        this.code = code;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public final String getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public final void setValue( String value ) {
        this.value = value;
    }
}
