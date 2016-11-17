/**
 * Copyright (c) 2008-2016, Massachusetts Institute of Technology (MIT)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package edu.mit.ll.dcds.common.entity.datalayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

import edu.mit.ll.dcds.common.entity.SADisplayMessageEntity;
import edu.mit.ll.dcds.common.entity.SADisplayPersistedEntity;

/**
 * Datalayerstyle generated by hbm2java
 */
@Entity
@Proxy(lazy=false)
@Table(name = "datalayerstyle")
public class DatalayerStyle extends SADisplayMessageEntity implements SADisplayPersistedEntity {
	
	 private int datalayerstyleid;
	 private String type;
	 private String value;
	 private String datalayerid;
	 
	 private Datalayer datalayer;
	 
	 public DatalayerStyle(){}
	 
	 public DatalayerStyle(int datalayerstyleid, String type, 
			 String value, String datalayerid) {
		 this.datalayerstyleid = datalayerstyleid;
		 this.type = type;
		 this.value = value;
		 this.datalayerid = datalayerid;
	 }
	 
	 @Id @GeneratedValue
	 @Column(name = "datalayerstyleid", unique = true, nullable = false)
	 public int getDatalayerstyleid() {
			return this.datalayerstyleid;
	 }

	 public void setDatalayerstyleid(int datalayerstyleid) {
			this.datalayerstyleid = datalayerstyleid;
	 }
	 
	 @Column(name = "type", nullable = false)
	 public String getType(){
		 return this.type;
	 }
	 
	 public void setType(String type){
		 this.type = type;
	 }
	 
	 @Column(name = "value", nullable = false)
	 public String getValue(){
		 return this.value;
	 }
	 
	 public void setValue(String value){
		 this.value = value;
	 }
	 
	 @Column(name = "datalayerid", nullable = false)
	 public String getDatalayerid(){
		 return this.datalayerid;
	 }
	 
	 public void setDatalayerid(String datalayerid){
		 this.datalayerid = datalayerid;
	 }
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "datalayerid", insertable=false, updatable = false)
	 public Datalayer getDatalayer() {
		return this.datalayer;
	 }
	 
	 public void setDatalayer(Datalayer datalayer){
		 this.datalayer = datalayer;
	 }
	 
	 public JSONObject toJSONObject(){
		 JSONObject json = new JSONObject();
		 try{
			 json.put("datalayerstyleid", this.datalayerstyleid);
			 json.put("type", this.type);
			 json.put("value", this.value);
			 json.put("datalayerid", this.datalayerid);
		 }catch(JSONException e){}
		 return json;
	 }
}