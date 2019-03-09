
package com.cnct.wsdemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="aname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cssdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="describtion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seoword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelBean", propOrder = {
    "addtime",
    "aid",
    "aname",
    "author",
    "bid",
    "cid",
    "cname",
    "counts",
    "cssdata",
    "describtion",
    "height",
    "hid",
    "hname",
    "keyword",
    "mname",
    "modelId",
    "mprice",
    "pcpath",
    "pcurl",
    "phoneurl",
    "phpath",
    "seoword",
    "sid",
    "sname",
    "status",
    "tid",
    "tname",
    "visites",
    "width"
})
public class ModelBean {

    protected String addtime;
    protected Integer aid;
    protected String aname;
    protected String author;
    protected Integer bid;
    protected Integer cid;
    protected String cname;
    protected Integer counts;
    protected String cssdata;
    protected String describtion;
    protected String height;
    protected Integer hid;
    protected String hname;
    protected String keyword;
    protected String mname;
    @XmlElement(name = "model_id")
    protected Integer modelId;
    protected String mprice;
    protected String pcpath;
    protected String pcurl;
    protected String phoneurl;
    protected String phpath;
    protected String seoword;
    protected Integer sid;
    protected String sname;
    protected Integer status;
    protected Integer tid;
    protected String tname;
    protected Integer visites;
    protected String width;

    /**
     * Gets the value of the addtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * Sets the value of the addtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtime(String value) {
        this.addtime = value;
    }

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAid(Integer value) {
        this.aid = value;
    }

    /**
     * Gets the value of the aname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAname() {
        return aname;
    }

    /**
     * Sets the value of the aname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAname(String value) {
        this.aname = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBid(Integer value) {
        this.bid = value;
    }

    /**
     * Gets the value of the cid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCid(Integer value) {
        this.cid = value;
    }

    /**
     * Gets the value of the cname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCname() {
        return cname;
    }

    /**
     * Sets the value of the cname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCname(String value) {
        this.cname = value;
    }

    /**
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCounts(Integer value) {
        this.counts = value;
    }

    /**
     * Gets the value of the cssdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssdata() {
        return cssdata;
    }

    /**
     * Sets the value of the cssdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssdata(String value) {
        this.cssdata = value;
    }

    /**
     * Gets the value of the describtion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribtion() {
        return describtion;
    }

    /**
     * Sets the value of the describtion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribtion(String value) {
        this.describtion = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the hid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * Sets the value of the hid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHid(Integer value) {
        this.hid = value;
    }

    /**
     * Gets the value of the hname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHname() {
        return hname;
    }

    /**
     * Sets the value of the hname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHname(String value) {
        this.hname = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the mname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMname() {
        return mname;
    }

    /**
     * Sets the value of the mname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMname(String value) {
        this.mname = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModelId(Integer value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the mprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMprice() {
        return mprice;
    }

    /**
     * Sets the value of the mprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMprice(String value) {
        this.mprice = value;
    }

    /**
     * Gets the value of the pcpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcpath() {
        return pcpath;
    }

    /**
     * Sets the value of the pcpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcpath(String value) {
        this.pcpath = value;
    }

    /**
     * Gets the value of the pcurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcurl() {
        return pcurl;
    }

    /**
     * Sets the value of the pcurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcurl(String value) {
        this.pcurl = value;
    }

    /**
     * Gets the value of the phoneurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneurl() {
        return phoneurl;
    }

    /**
     * Sets the value of the phoneurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneurl(String value) {
        this.phoneurl = value;
    }

    /**
     * Gets the value of the phpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhpath() {
        return phpath;
    }

    /**
     * Sets the value of the phpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhpath(String value) {
        this.phpath = value;
    }

    /**
     * Gets the value of the seoword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeoword() {
        return seoword;
    }

    /**
     * Sets the value of the seoword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeoword(String value) {
        this.seoword = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSid(Integer value) {
        this.sid = value;
    }

    /**
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSname() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSname(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTid(Integer value) {
        this.tid = value;
    }

    /**
     * Gets the value of the tname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTname() {
        return tname;
    }

    /**
     * Sets the value of the tname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTname(String value) {
        this.tname = value;
    }

    /**
     * Gets the value of the visites property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisites() {
        return visites;
    }

    /**
     * Sets the value of the visites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisites(Integer value) {
        this.visites = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

}
