class flashcard{
	def __init__(self, acr, n, ctxt, definition):
		self.acr = acr
		self.n = n
		self.ctxt = ctxt
		self.definition = definition

}


f{acr{AS} n{autonomous systems} ctxt{advanced internetworking} def{a network that is administered independently of other ASs}}
f{n{area} ctxt{advanced internetworking} def{set of routers that are administratively configured to echange link-state information with each other}}
f{acr{ABR} n{area border router} ctxt{advanced internetworking} def{a router that is a member of both the backbone area and a nonbackbone area}}

def main():
	# table = []
	table = [
	flashcard('', 'virtual link', 'advanced internetworking', 
		'use a trick to flexibly decide which routers go in backbone.'+
		'obtained by configuring a router that is not directly connected to'+
		'backbone to exchange backbone routing information with a router that is'),
	flashcard("ISP", "Internet Service Provider", "","private company. mainly existing"
		+"to provide service to 'customers'"),
	flashcard('','domain', 'internetworking', 'an autonomous system in the internet'),
	flashcard('','interdomain routing', '','routing between two autonomous systems(ASs)'),
	flashcard('','intradomain routing', '','routing within an autonomous system (AS)'),
	flashcard('EGP', 'Exterior Gateway Protocol', 'interdomain routing protocol',
				'first interdomain routing protocol, constrained topology of internet'
				+'significantly... used when internet was a tree topology, did not'
				+'allow for topology to become more general. single backbone')
	flashcard('BGP','Border Gateway Protocol', 'interdomain routing protocol',
				'replacement for EGP, currently in version 4, no assumptions about'
				+ 'how ASs are connected. '),
	flashcard("", "peering point", "internetworking","a thing ISPs will often arrage to interconnect"
				+"with each other"),
	flashcard("","local traffic", "interdomain routing","trafiic that originates"
		+"at or terminated on nodes within an AS"),
	flashcard("","transit traffic","interdomain routing","traffic that passes through"
		+"an AS"),
	flashcard("","Stub AS","interdomain networking", "an AS that has onle a single"
		+"connection")
	]