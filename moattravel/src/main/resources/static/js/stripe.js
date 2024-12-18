const stripe = Stripe('pk_test_51QVOBiJXdQBAviWOr0cWsVhQqqhhPfIUygM52kgupHwCykbZkLjuPxb0554bH7LqESCwFgPLAp5dnCB0TjmYgLCI00l4sroJiH');
const paymentButton = document.querySelector('#paymentButton');
paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});
