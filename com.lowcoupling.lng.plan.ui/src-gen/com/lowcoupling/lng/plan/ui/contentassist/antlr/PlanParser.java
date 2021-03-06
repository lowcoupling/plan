/*
 * generated by Xtext
 */
package com.lowcoupling.lng.plan.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.lowcoupling.lng.plan.services.PlanGrammarAccess;

public class PlanParser extends AbstractContentAssistParser {
	
	@Inject
	private PlanGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.lowcoupling.lng.plan.ui.contentassist.antlr.internal.InternalPlanParser createParser() {
		com.lowcoupling.lng.plan.ui.contentassist.antlr.internal.InternalPlanParser result = new com.lowcoupling.lng.plan.ui.contentassist.antlr.internal.InternalPlanParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramAccess().getAlternatives(), "rule__Program__Alternatives");
					put(grammarAccess.getActivityElementAccess().getAlternatives(), "rule__ActivityElement__Alternatives");
					put(grammarAccess.getCheckPointAccess().getAlternatives_5_0(), "rule__CheckPoint__Alternatives_5_0");
					put(grammarAccess.getActivityAccess().getAlternatives_6_0(), "rule__Activity__Alternatives_6_0");
					put(grammarAccess.getActivityAccess().getAlternatives_6_1_0(), "rule__Activity__Alternatives_6_1_0");
					put(grammarAccess.getResponsibilityAccess().getAlternatives(), "rule__Responsibility__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup_0(), "rule__Program__Group_0__0");
					put(grammarAccess.getProgramAccess().getGroup_0_1(), "rule__Program__Group_0_1__0");
					put(grammarAccess.getProgramAccess().getGroup_0_1_3(), "rule__Program__Group_0_1_3__0");
					put(grammarAccess.getProgramAccess().getGroup_0_1_4(), "rule__Program__Group_0_1_4__0");
					put(grammarAccess.getProgramAccess().getGroup_0_1_5(), "rule__Program__Group_0_1_5__0");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_4(), "rule__Project__Group_4__0");
					put(grammarAccess.getProjectAccess().getGroup_6(), "rule__Project__Group_6__0");
					put(grammarAccess.getProjectAccess().getGroup_7(), "rule__Project__Group_7__0");
					put(grammarAccess.getProjectAccess().getGroup_8(), "rule__Project__Group_8__0");
					put(grammarAccess.getAssumptionAccess().getGroup(), "rule__Assumption__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getActivityGroupAccess().getGroup(), "rule__ActivityGroup__Group__0");
					put(grammarAccess.getActivityGroupAccess().getGroup_4(), "rule__ActivityGroup__Group_4__0");
					put(grammarAccess.getActivityGroupAccess().getGroup_5(), "rule__ActivityGroup__Group_5__0");
					put(grammarAccess.getWBSImportAccess().getGroup(), "rule__WBSImport__Group__0");
					put(grammarAccess.getResourcesImportAccess().getGroup(), "rule__ResourcesImport__Group__0");
					put(grammarAccess.getPlanImportAccess().getGroup(), "rule__PlanImport__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getResourcesAccess().getGroup(), "rule__Resources__Group__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getCheckPointAccess().getGroup(), "rule__CheckPoint__Group__0");
					put(grammarAccess.getCheckPointAccess().getGroup_4(), "rule__CheckPoint__Group_4__0");
					put(grammarAccess.getCheckPointAccess().getGroup_5_0_0(), "rule__CheckPoint__Group_5_0_0__0");
					put(grammarAccess.getCheckPointAccess().getGroup_5_0_1(), "rule__CheckPoint__Group_5_0_1__0");
					put(grammarAccess.getCheckPointAccess().getGroup_5_1(), "rule__CheckPoint__Group_5_1__0");
					put(grammarAccess.getCheckPointAccess().getGroup_5_1_4(), "rule__CheckPoint__Group_5_1_4__0");
					put(grammarAccess.getResourceInvolvementAccess().getGroup(), "rule__ResourceInvolvement__Group__0");
					put(grammarAccess.getResourceInvolvementAccess().getGroup_1(), "rule__ResourceInvolvement__Group_1__0");
					put(grammarAccess.getResourceInvolvementAccess().getGroup_2(), "rule__ResourceInvolvement__Group_2__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_4(), "rule__Activity__Group_4__0");
					put(grammarAccess.getActivityAccess().getGroup_5(), "rule__Activity__Group_5__0");
					put(grammarAccess.getActivityAccess().getGroup_6_0_0(), "rule__Activity__Group_6_0_0__0");
					put(grammarAccess.getActivityAccess().getGroup_6_0_1(), "rule__Activity__Group_6_0_1__0");
					put(grammarAccess.getActivityAccess().getGroup_6_1(), "rule__Activity__Group_6_1__0");
					put(grammarAccess.getActivityAccess().getGroup_6_1_0_0(), "rule__Activity__Group_6_1_0_0__0");
					put(grammarAccess.getActivityAccess().getGroup_6_1_0_1(), "rule__Activity__Group_6_1_0_1__0");
					put(grammarAccess.getActivityAccess().getGroup_6_2(), "rule__Activity__Group_6_2__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0(), "rule__Program__DescriptionAssignment_0_0");
					put(grammarAccess.getProgramAccess().getNameAssignment_0_1_1(), "rule__Program__NameAssignment_0_1_1");
					put(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1(), "rule__Program__LongNameAssignment_0_1_3_1");
					put(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0(), "rule__Program__PlansAssignment_0_1_4_0");
					put(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1(), "rule__Program__ReferencedProjectsAssignment_0_1_5_1");
					put(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6(), "rule__Program__ProjectsAssignment_0_1_6");
					put(grammarAccess.getProgramAccess().getProjectsAssignment_1(), "rule__Program__ProjectsAssignment_1");
					put(grammarAccess.getProjectAccess().getDescriptionAssignment_0(), "rule__Project__DescriptionAssignment_0");
					put(grammarAccess.getProjectAccess().getNameAssignment_2(), "rule__Project__NameAssignment_2");
					put(grammarAccess.getProjectAccess().getLongNameAssignment_4_1(), "rule__Project__LongNameAssignment_4_1");
					put(grammarAccess.getProjectAccess().getResourcesAssignment_5(), "rule__Project__ResourcesAssignment_5");
					put(grammarAccess.getProjectAccess().getPlansAssignment_6_0(), "rule__Project__PlansAssignment_6_0");
					put(grammarAccess.getProjectAccess().getAssumptionsAssignment_7_2(), "rule__Project__AssumptionsAssignment_7_2");
					put(grammarAccess.getProjectAccess().getConstraintsAssignment_8_2(), "rule__Project__ConstraintsAssignment_8_2");
					put(grammarAccess.getProjectAccess().getActivitiesAssignment_9(), "rule__Project__ActivitiesAssignment_9");
					put(grammarAccess.getAssumptionAccess().getValueAssignment_1(), "rule__Assumption__ValueAssignment_1");
					put(grammarAccess.getConstraintAccess().getValueAssignment_1(), "rule__Constraint__ValueAssignment_1");
					put(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0(), "rule__ActivityGroup__DescriptionAssignment_0");
					put(grammarAccess.getActivityGroupAccess().getNameAssignment_2(), "rule__ActivityGroup__NameAssignment_2");
					put(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1(), "rule__ActivityGroup__LongNameAssignment_4_1");
					put(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_5_1(), "rule__ActivityGroup__DependenciesAssignment_5_1");
					put(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_6(), "rule__ActivityGroup__ActivitiesAssignment_6");
					put(grammarAccess.getWBSImportAccess().getImportURIAssignment_1(), "rule__WBSImport__ImportURIAssignment_1");
					put(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1(), "rule__ResourcesImport__ImportURIAssignment_1");
					put(grammarAccess.getPlanImportAccess().getImportURIAssignment_1(), "rule__PlanImport__ImportURIAssignment_1");
					put(grammarAccess.getResourcesAccess().getResourceAssignment_2(), "rule__Resources__ResourceAssignment_2");
					put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
					put(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0(), "rule__CheckPoint__DescriptionAssignment_0");
					put(grammarAccess.getCheckPointAccess().getNameAssignment_2(), "rule__CheckPoint__NameAssignment_2");
					put(grammarAccess.getCheckPointAccess().getLongNameAssignment_4_1(), "rule__CheckPoint__LongNameAssignment_4_1");
					put(grammarAccess.getCheckPointAccess().getEndAssignment_5_0_0_1(), "rule__CheckPoint__EndAssignment_5_0_0_1");
					put(grammarAccess.getCheckPointAccess().getAfterAssignment_5_0_1_1(), "rule__CheckPoint__AfterAssignment_5_0_1_1");
					put(grammarAccess.getCheckPointAccess().getOffsetAssignment_5_0_1_3(), "rule__CheckPoint__OffsetAssignment_5_0_1_3");
					put(grammarAccess.getCheckPointAccess().getCompletenessAssignment_5_1_1(), "rule__CheckPoint__CompletenessAssignment_5_1_1");
					put(grammarAccess.getCheckPointAccess().getDependenciesAssignment_5_1_4_1(), "rule__CheckPoint__DependenciesAssignment_5_1_4_1");
					put(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0(), "rule__ResourceInvolvement__ResourceAssignment_0");
					put(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1(), "rule__ResourceInvolvement__OccupationAssignment_1_1");
					put(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1(), "rule__ResourceInvolvement__ResponsibilityAssignment_2_1");
					put(grammarAccess.getActivityAccess().getDescriptionAssignment_0(), "rule__Activity__DescriptionAssignment_0");
					put(grammarAccess.getActivityAccess().getNameAssignment_2(), "rule__Activity__NameAssignment_2");
					put(grammarAccess.getActivityAccess().getLongNameAssignment_4_1(), "rule__Activity__LongNameAssignment_4_1");
					put(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2(), "rule__Activity__InvolvedResourcesAssignment_5_2");
					put(grammarAccess.getActivityAccess().getStartAssignment_6_0_0_1(), "rule__Activity__StartAssignment_6_0_0_1");
					put(grammarAccess.getActivityAccess().getAfterAssignment_6_0_1_1(), "rule__Activity__AfterAssignment_6_0_1_1");
					put(grammarAccess.getActivityAccess().getOffsetAssignment_6_0_1_3(), "rule__Activity__OffsetAssignment_6_0_1_3");
					put(grammarAccess.getActivityAccess().getEndAssignment_6_1_0_0_1(), "rule__Activity__EndAssignment_6_1_0_0_1");
					put(grammarAccess.getActivityAccess().getDurationAssignment_6_1_0_1_1(), "rule__Activity__DurationAssignment_6_1_0_1_1");
					put(grammarAccess.getActivityAccess().getCompletenessAssignment_6_1_2(), "rule__Activity__CompletenessAssignment_6_1_2");
					put(grammarAccess.getActivityAccess().getDependenciesAssignment_6_2_1(), "rule__Activity__DependenciesAssignment_6_2_1");
					put(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), "rule__CheckPoint__UnorderedGroup_5");
					put(grammarAccess.getActivityAccess().getUnorderedGroup_6(), "rule__Activity__UnorderedGroup_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.lowcoupling.lng.plan.ui.contentassist.antlr.internal.InternalPlanParser typedParser = (com.lowcoupling.lng.plan.ui.contentassist.antlr.internal.InternalPlanParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public PlanGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
