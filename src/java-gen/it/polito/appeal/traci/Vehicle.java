

/*
    THIS FILE IS GENERATED AUTOMATICALLY. DO NOT EDIT: CHANGES WILL BE OVERWRITTEN.
    File generated by traciObject.xslt.
*/

/*   
    Copyright (C) 2013 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/


package it.polito.appeal.traci;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**

	Representation of a vehicle in the SUMO environment.
	@see <a href="http://sumo.sourceforge.net/doc/current/docs/userdoc/Definition_of_Vehicles,_Vehicle_Types,_and_Routes.html#Vehicle_Types">SUMO documentation</a>
	@author Enrico Gueli &lt;enrico.gueli@polito.it&gt;
	
*/
public class Vehicle 
extends TraciObject<Vehicle.Variable>
implements StepAdvanceListener
{

	/**
	 * Enumerates all the read queries. Each value can be used as an argument
	 * for {@link TraciObject#getReadQuery(Enum)}.
	 * 
	 * @author Enrico Gueli &lt;enrico.gueli@polito.it&gt;
	 */	
	public static enum Variable {
		
		/** 
		 * Query "ReadSpeed"
		 * @see {@link #queryReadSpeed}
		 */
		SPEED,
		
		/** 
		 * Query "ReadPosition"
		 * @see {@link #queryReadPosition}
		 */
		POSITION,
		
		/** 
		 * Query "ReadLanePosition"
		 * @see {@link #queryReadLanePosition}
		 */
		LANE_POSITION,
		
		/** 
		 * Query "ReadCurrentLaneIndex"
		 * @see {@link #queryReadCurrentLaneIndex}
		 */
		LANE_INDEX,
		
		/** 
		 * Query "ReadCurrentLane"
		 * @see {@link #queryReadCurrentLane}
		 */
		LANE_ID,
		
		/** 
		 * Query "ReadCurrentRoute"
		 * @see {@link #queryReadCurrentRoute}
		 */
		CURRENT_ROUTE,
		
		/** 
		 * Query "ReadCurrentEdge"
		 * @see {@link #queryReadCurrentEdge}
		 */
		CURRENT_EDGE,
		
		/** 
		 * Query "ReadCO2Emission"
		 * @see {@link #queryReadCO2Emission}
		 */
		CO2_EMISSION,
		
		/** 
		 * Query "ReadCOEmission"
		 * @see {@link #queryReadCOEmission}
		 */
		CO_EMISSION,
		
		/** 
		 * Query "ReadHCEmission"
		 * @see {@link #queryReadHCEmission}
		 */
		HC_EMISSION,
		
		/** 
		 * Query "ReadPMXEmission"
		 * @see {@link #queryReadPMXEmission}
		 */
		PMX_EMISSION,
		
		/** 
		 * Query "ReadNOXEmission"
		 * @see {@link #queryReadNOXEmission}
		 */
		NOX_EMISSION,
		
		/** 
		 * Query "ReadFuelConsumption"
		 * @see {@link #queryReadFuelConsumption}
		 */
		FUEL_CONSUMPTION,
		
		/** 
		 * Query "ReadNoiseEmission"
		 * @see {@link #queryReadNoiseEmission}
		 */
		NOISE_EMISSION,
		
		/** 
		 * Query "ReadColor"
		 * @see {@link #queryReadColor}
		 */
		COLOR,
		
		/** 
		 * Query "ReadType"
		 * @see {@link #queryReadType}
		 */
		TYPE,
		
	}
	
	
	private final ChangeEdgeTravelTimeQuery csqvar_SetEdgeTravelTime;
	
	private final RerouteQuery csqvar_Reroute;
	
	private final ChangeLaneIndexQuery csqvar_ChangeLaneIndex;
	
	private final ChangeColorQuery csqvar_ChangeColor;
	
	private final ChangeTargetQuery csqvar_ChangeTarget;
	
	private final ChangeMaxSpeedQuery csqvar_ChangeMaxSpeed;
	
	private final ChangeRouteQuery csqvar_ChangeRoute;
	
	private final ChangeSpeedQuery csqvar_ChangeSpeed;
	Vehicle (
		DataInputStream dis,
		DataOutputStream dos, 
		String id
		
			, Repository<Edge> repoEdge
			, Repository<Lane> repoLane
	) {
		super(id, Variable.class);

		/*
		 * initialization of read queries
		 */
		
		addReadQuery(Variable.SPEED, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_SPEED
				
				));
		
		addReadQuery(Variable.POSITION, 
				new ReadObjectVarQuery.PositionQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_POSITION
				
				));
		
		addReadQuery(Variable.LANE_POSITION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_LANEPOSITION
				
				));
		
		addReadQuery(Variable.LANE_INDEX, 
				new ReadObjectVarQuery.IntegerQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_LANE_INDEX
				
				));
		
		addReadQuery(Variable.LANE_ID, 
				new ReadObjectVarQuery.LaneQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_LANE_ID
				, repoLane
				
				));
		
		addReadQuery(Variable.CURRENT_ROUTE, 
				new RouteQuery (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_EDGES
				, repoEdge
				
				));
		
		addReadQuery(Variable.CURRENT_EDGE, 
				new ReadObjectVarQuery.EdgeQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_ROAD_ID
				, repoEdge
				
				));
		
		addReadQuery(Variable.CO2_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_CO2EMISSION
				
				));
		
		addReadQuery(Variable.CO_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_COEMISSION
				
				));
		
		addReadQuery(Variable.HC_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_HCEMISSION
				
				));
		
		addReadQuery(Variable.PMX_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_PMXEMISSION
				
				));
		
		addReadQuery(Variable.NOX_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_NOXEMISSION
				
				));
		
		addReadQuery(Variable.FUEL_CONSUMPTION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_FUELCONSUMPTION
				
				));
		
		addReadQuery(Variable.NOISE_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_NOISEEMISSION
				
				));
		
		addReadQuery(Variable.COLOR, 
				new ReadObjectVarQuery.ColorQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_COLOR
				
				));
		
		addReadQuery(Variable.TYPE, 
				new ReadObjectVarQuery.StringQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_VEHICLE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_TYPE
				
				));
		

		/*
		 * initialization of change state queries
		 */
		
		csqvar_SetEdgeTravelTime = new ChangeEdgeTravelTimeQuery(dis, dos, id
		)
		;
		
		csqvar_Reroute = new RerouteQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadCurrentRoute().setObsolete();
				
			}
		};
		
		csqvar_ChangeLaneIndex = new ChangeLaneIndexQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadCurrentLaneIndex().setObsolete();
				
			}
		};
		
		csqvar_ChangeColor = new ChangeColorQuery(dis, dos, id
		, it.polito.appeal.traci.protocol.Constants.CMD_SET_VEHICLE_VARIABLE, it.polito.appeal.traci.protocol.Constants.VAR_COLOR)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadColor().setObsolete();
				
			}
		};
		
		csqvar_ChangeTarget = new ChangeTargetQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadCurrentRoute().setObsolete();
				
			}
		};
		
		csqvar_ChangeMaxSpeed = new ChangeMaxSpeedQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
			}
		};
		
		csqvar_ChangeRoute = new ChangeRouteQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadCurrentRoute().setObsolete();
				
			}
		};
		
		csqvar_ChangeSpeed = new ChangeSpeedQuery(dis, dos, id
		)
		{
			@Override
			void pickResponses(java.util.Iterator<it.polito.appeal.traci.protocol.ResponseContainer> responseIterator)
					throws TraCIException {
				super.pickResponses(responseIterator);
				
				queryReadSpeed().setObsolete();
				
			}
		};
		
	
	}
	
	
	
	@Override
	public void nextStep(double step) {
		
		getReadQuery(Variable.SPEED).setObsolete();
		
		getReadQuery(Variable.POSITION).setObsolete();
		
		getReadQuery(Variable.LANE_POSITION).setObsolete();
		
		getReadQuery(Variable.LANE_INDEX).setObsolete();
		
		getReadQuery(Variable.LANE_ID).setObsolete();
		
		getReadQuery(Variable.CURRENT_EDGE).setObsolete();
		
		getReadQuery(Variable.CO2_EMISSION).setObsolete();
		
		getReadQuery(Variable.CO_EMISSION).setObsolete();
		
		getReadQuery(Variable.HC_EMISSION).setObsolete();
		
		getReadQuery(Variable.PMX_EMISSION).setObsolete();
		
		getReadQuery(Variable.NOX_EMISSION).setObsolete();
		
		getReadQuery(Variable.FUEL_CONSUMPTION).setObsolete();
		
		getReadQuery(Variable.NOISE_EMISSION).setObsolete();
		
		getReadQuery(Variable.COLOR).setObsolete();
		
	}
	
	
	
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadSpeed() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.SPEED);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getSpeed() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.SPEED)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.awt.geom.Point2D> queryReadPosition() {
		return (ReadObjectVarQuery.PositionQ) getReadQuery(Variable.POSITION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.awt.geom.Point2D getPosition() throws IOException {
		return ((ReadObjectVarQuery.PositionQ) getReadQuery(Variable.POSITION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadLanePosition() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.LANE_POSITION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getLanePosition() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.LANE_POSITION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Integer> queryReadCurrentLaneIndex() {
		return (ReadObjectVarQuery.IntegerQ) getReadQuery(Variable.LANE_INDEX);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Integer getLaneIndex() throws IOException {
		return ((ReadObjectVarQuery.IntegerQ) getReadQuery(Variable.LANE_INDEX)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Lane> queryReadCurrentLane() {
		return (ReadObjectVarQuery.LaneQ) getReadQuery(Variable.LANE_ID);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public Lane getLaneId() throws IOException {
		return ((ReadObjectVarQuery.LaneQ) getReadQuery(Variable.LANE_ID)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.util.List<Edge>> queryReadCurrentRoute() {
		return (RouteQuery) getReadQuery(Variable.CURRENT_ROUTE);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.util.List<Edge> getCurrentRoute() throws IOException {
		return ((RouteQuery) getReadQuery(Variable.CURRENT_ROUTE)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Edge> queryReadCurrentEdge() {
		return (ReadObjectVarQuery.EdgeQ) getReadQuery(Variable.CURRENT_EDGE);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public Edge getCurrentEdge() throws IOException {
		return ((ReadObjectVarQuery.EdgeQ) getReadQuery(Variable.CURRENT_EDGE)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadCO2Emission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO2_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getCo2Emission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO2_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadCOEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getCoEmission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadHCEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.HC_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getHcEmission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.HC_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadPMXEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.PMX_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getPmxEmission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.PMX_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadNOXEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOX_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getNoxEmission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOX_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadFuelConsumption() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.FUEL_CONSUMPTION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getFuelConsumption() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.FUEL_CONSUMPTION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadNoiseEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOISE_EMISSION);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.Double getNoiseEmission() throws IOException {
		return ((ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOISE_EMISSION)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.awt.Color> queryReadColor() {
		return (ReadObjectVarQuery.ColorQ) getReadQuery(Variable.COLOR);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.awt.Color getColor() throws IOException {
		return ((ReadObjectVarQuery.ColorQ) getReadQuery(Variable.COLOR)).get();
	}
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.String> queryReadType() {
		return (ReadObjectVarQuery.StringQ) getReadQuery(Variable.TYPE);
	}
	
	
	/**
	 * Executes an instance of {@link ReadObjectVarQuery} relative to this query,
	 * and returns the corresponding value.
	 */
	public java.lang.String getType() throws IOException {
		return ((ReadObjectVarQuery.StringQ) getReadQuery(Variable.TYPE)).get();
	}
	
	/**
	 * @return the instance of {@link ChangeEdgeTravelTimeQuery} relative to this query.
	 */
	public ChangeEdgeTravelTimeQuery querySetEdgeTravelTime() {
		return csqvar_SetEdgeTravelTime;
	}
	
	
	/**
	 * @return the instance of {@link RerouteQuery} relative to this query.
	 */
	public RerouteQuery queryReroute() {
		return csqvar_Reroute;
	}
	
	
	/**
	 * @return the instance of {@link ChangeLaneIndexQuery} relative to this query.
	 */
	public ChangeLaneIndexQuery queryChangeLaneIndex() {
		return csqvar_ChangeLaneIndex;
	}
	
	
	/**
	 * Execute an instance of ChangeLaneIndexQuery set to the given value.
	 * 
	 * This setter method is equivalent to queryChangeLaneIndex().setValue(value).run().
	 */
	public void changeLaneIndex(LaneIndexQueryParameter value) throws IOException {
		ChangeLaneIndexQuery q = csqvar_ChangeLaneIndex;
		q.setValue(value);
		q.run();
	}
	
	/**
	 * @return the instance of {@link ChangeColorQuery} relative to this query.
	 */
	public ChangeColorQuery queryChangeColor() {
		return csqvar_ChangeColor;
	}
	
	
	/**
	 * Execute an instance of ChangeColorQuery set to the given value.
	 * 
	 * This setter method is equivalent to queryChangeColor().setValue(value).run().
	 */
	public void changeColor(java.awt.Color value) throws IOException {
		ChangeColorQuery q = csqvar_ChangeColor;
		q.setValue(value);
		q.run();
	}
	
	/**
	 * @return the instance of {@link ChangeTargetQuery} relative to this query.
	 */
	public ChangeTargetQuery queryChangeTarget() {
		return csqvar_ChangeTarget;
	}
	
	
	/**
	 * Execute an instance of ChangeTargetQuery set to the given value.
	 * 
	 * This setter method is equivalent to queryChangeTarget().setValue(value).run().
	 */
	public void changeTarget(Edge value) throws IOException {
		ChangeTargetQuery q = csqvar_ChangeTarget;
		q.setValue(value);
		q.run();
	}
	
	/**
	 * @return the instance of {@link ChangeMaxSpeedQuery} relative to this query.
	 */
	public ChangeMaxSpeedQuery queryChangeMaxSpeed() {
		return csqvar_ChangeMaxSpeed;
	}
	
	
	/**
	 * @return the instance of {@link ChangeRouteQuery} relative to this query.
	 */
	public ChangeRouteQuery queryChangeRoute() {
		return csqvar_ChangeRoute;
	}
	
	
	/**
	 * Execute an instance of ChangeRouteQuery set to the given value.
	 * 
	 * This setter method is equivalent to queryChangeRoute().setValue(value).run().
	 */
	public void changeRoute(java.util.List<Edge> value) throws IOException {
		ChangeRouteQuery q = csqvar_ChangeRoute;
		q.setValue(value);
		q.run();
	}
	
	/**
	 * @return the instance of {@link ChangeSpeedQuery} relative to this query.
	 */
	public ChangeSpeedQuery queryChangeSpeed() {
		return csqvar_ChangeSpeed;
	}
	
	
	/**
	 * Execute an instance of ChangeSpeedQuery set to the given value.
	 * 
	 * This setter method is equivalent to queryChangeSpeed().setValue(value).run().
	 */
	public void changeSpeed(Double value) throws IOException {
		ChangeSpeedQuery q = csqvar_ChangeSpeed;
		q.setValue(value);
		q.run();
	}
	
}

