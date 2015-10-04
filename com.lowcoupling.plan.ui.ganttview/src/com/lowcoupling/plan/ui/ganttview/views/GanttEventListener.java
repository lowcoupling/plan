package com.lowcoupling.plan.ui.ganttview.views;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttPhase;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.nebula.widgets.ganttchart.GanttSpecialDateRange;
import org.eclipse.nebula.widgets.ganttchart.IGanttEventListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.GC;

public class GanttEventListener implements IGanttEventListener {

	@Override
	public void eventsMoved(List events, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventsResized(List events, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventsMoveFinished(List events, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventsResizeFinished(List events, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void phaseMoved(GanttPhase phase, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void phaseResized(GanttPhase phase, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void phaseMoveFinished(GanttPhase phase, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void phaseResizeFinished(GanttPhase phase, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventSelected(GanttEvent event, List allSelectedEvents,
			MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		Iterator<GanttEvent> ganttIterator = allSelectedEvents.iterator();
		while (ganttIterator.hasNext()){
			GanttEvent ge = ganttIterator.next();
			System.out.println("Selected "+ge.getName());
		}
	}

	@Override
	public void eventsDeleteRequest(List events, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventDoubleClicked(GanttEvent event, MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomedIn(int newZoomLevel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomedOut(int newZoomLevel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomReset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventPropertiesSelected(List events) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventHeaderSelected(Calendar newlySelectedDate,
			List allSelectedDates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lastDraw(GC gc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventMovedToNewSection(GanttEvent event,
			GanttSection oldSection, GanttSection newSection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventReordered(GanttEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventsDroppedOrResizedOntoUnallowedDateRange(List events,
			GanttSpecialDateRange range) {
		// TODO Auto-generated method stub
		
	}

}
