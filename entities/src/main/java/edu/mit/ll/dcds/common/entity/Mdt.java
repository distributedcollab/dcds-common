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
package edu.mit.ll.dcds.common.entity;

// Generated Jun 6, 2013 9:56:44 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.vividsolutions.jts.geom.Geometry;

/**
 * Mdt generated by hbm2java
 */
@Entity
@Table(name = "mdt", schema = "public")
@SequenceGenerator(name = "SEQ_STORE",
sequenceName = "mdt_seq",
allocationSize = 1)
public class Mdt implements java.io.Serializable {
	private static final long serialVersionUID = -3319346490605055680L;
	
	private long id;
	private UserInfo userInfo;
	private String deviceId;
	private Geometry location;
	private Double course;
	private Double speed;
	private Double accuracy;
	private long time;

	public Mdt() {
	}

	public Mdt(long id, UserInfo userInfo, String deviceId, Geometry location,
			long time) {
		this.id = id;
		this.userInfo = userInfo;
		this.deviceId = deviceId;
		this.location = location;
		this.time = time;
	}

	public Mdt(long id, UserInfo userInfo, String deviceId, Geometry location,
			Double course, Double speed, Double accuracy, long time) {
		this.id = id;
		this.userInfo = userInfo;
		this.deviceId = deviceId;
		this.location = location;
		this.course = course;
		this.speed = speed;
		this.accuracy = accuracy;
		this.time = time;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STORE")
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@Column(name = "device_id", nullable = false, length = 250)
	public String getDeviceId() {
		return this.deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Type(type="org.hibernate.spatial.GeometryType")
	@Column(name = "location", nullable = false)
	public Geometry getLocation() {
		return this.location;
	}

	public void setLocation(Geometry location) {
		this.location = location;
	}

	@Column(name = "course", precision = 17, scale = 17)
	public Double getCourse() {
		return this.course;
	}

	public void setCourse(Double course) {
		this.course = course;
	}

	@Column(name = "speed", precision = 17, scale = 17)
	public Double getSpeed() {
		return this.speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@Column(name = "accuracy", precision = 17, scale = 17)
	public Double getAccuracy() {
		return this.accuracy;
	}

	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}

	@Column(name = "time", nullable = false)
	public long getTime() {
		return this.time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
}