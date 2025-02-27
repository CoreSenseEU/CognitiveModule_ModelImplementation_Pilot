/*
 * generated by Xtext 2.38.0
 */
package eu.coresense.cognitivemodule.serializer;

import com.google.inject.Inject;
import eu.coresense.cognitivemodule.services.CogModGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CogModSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CogModGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CognitiveModule___AfferentKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q;
	protected AbstractElementAlias match_CognitiveModule___EfferentKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CogModGrammarAccess) access;
		match_CognitiveModule___AfferentKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getAfferentKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_7_1()), new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_7_3()));
		match_CognitiveModule___EfferentKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getEfferentKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_6_1()), new TokenAlias(false, false, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CognitiveModule___AfferentKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q.equals(syntax))
				emit_CognitiveModule___AfferentKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CognitiveModule___EfferentKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q.equals(syntax))
				emit_CognitiveModule___EfferentKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('afferent:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     core=Core ('efferent:' BEGIN END)? (ambiguity) 'meta:' meta=Meta
	 *     efferent+=Modelet END (ambiguity) 'meta:' meta=Meta
	 
	 * </pre>
	 */
	protected void emit_CognitiveModule___AfferentKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('efferent:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     core=Core (ambiguity) 'afferent:' BEGIN afferent+=Modelet
	 *     core=Core (ambiguity) ('afferent:' BEGIN END)? 'meta:' meta=Meta
	 
	 * </pre>
	 */
	protected void emit_CognitiveModule___EfferentKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
