var placesAutocompleteStart = places({
    container: document.querySelector('#cityStart'),
    type: 'city',
    countries: ['fr'],
    aroundLatLngViaIP: false,
    appId: 'pl1NXUFWIA0R',
    apiKey: 'bce9e1e617ea94cbfce98b58c3725115',
    templates: {
        value: function(suggestion) {
            return suggestion.name;
        }
    }
});

placesAutocompleteStart.on('change', e => {
    console.log(e.suggestion);
});

var placesAutocompleteStop = places({
    container: document.querySelector('#cityStop'),
    type: 'city',
    countries: ['fr'],
    aroundLatLngViaIP: false,
    appId: 'pl1NXUFWIA0R',
    apiKey: 'bce9e1e617ea94cbfce98b58c3725115',
    templates: {
        value: function(suggestion) {
            return suggestion.name;
        }
    }
});

placesAutocompleteStop.on('change', e => {
    console.log(e.suggestion);
});
